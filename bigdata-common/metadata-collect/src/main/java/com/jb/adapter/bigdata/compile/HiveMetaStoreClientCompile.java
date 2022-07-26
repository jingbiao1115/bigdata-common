package com.jb.adapter.bigdata.compile;

import com.csii.walle.common.exception.CsiiRuntimeException;
import com.google.common.annotations.VisibleForTesting;
import org.apache.hadoop.hive.common.ObjectPair;
import org.apache.hadoop.hive.common.ValidTxnList;
import org.apache.hadoop.hive.common.classification.InterfaceAudience;
import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.hadoop.hive.conf.HiveConf.ConfVars;
import org.apache.hadoop.hive.conf.HiveConfUtil;
import org.apache.hadoop.hive.metastore.*;
import org.apache.hadoop.hive.metastore.HiveMetaStore.HMSHandler;
import org.apache.hadoop.hive.metastore.api.*;
import org.apache.hadoop.hive.metastore.api.ThriftHiveMetastore.Iface;
import org.apache.hadoop.hive.metastore.partition.spec.PartitionSpecProxy;
import org.apache.hadoop.hive.metastore.txn.TxnUtils;
import org.apache.hadoop.hive.shims.ShimLoader;
import org.apache.hadoop.hive.shims.Utils;
import org.apache.hadoop.hive.thrift.HadoopThriftAuthBridge.Client;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.util.StringUtils;
import org.apache.thrift.TApplicationException;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.security.auth.login.LoginException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhaojb
 * hive metastore 编译
 */
public class HiveMetaStoreClientCompile implements IMetaStoreClient{
    Iface client;
    private TTransport transport;
    private boolean isConnected;
    private URI[] metastoreUris;
    private final HiveMetaHookLoader hookLoader;
    protected final HiveConf conf;
    protected boolean fastpath;
    private String tokenStrForm;
    private final boolean localMetaStore;
    private final MetaStoreFilterHook filterHook;
//    private final int fileMetadataBatchSize;
    private Map<String, String> currentMetaVars;
    private static final AtomicInteger connCount = new AtomicInteger(0);
    private int retries;
    private long retryDelaySeconds;
    protected static final Logger LOG = LoggerFactory.getLogger("hive.metastore");

    public HiveMetaStoreClientCompile(HiveConf conf) throws MetaException {
//        this(conf, (HiveMetaHookLoader)null, true);
        this(conf, (HiveMetaHookLoader)null, Boolean.TRUE);
    }

    public HiveMetaStoreClientCompile(HiveConf conf, HiveMetaHookLoader hookLoader, Boolean allowEmbedded) throws MetaException {
        this.client = null;
        this.transport = null;
        this.isConnected = false;
        this.fastpath = false;
        this.retries = 5;
        this.retryDelaySeconds = 0L;
        this.hookLoader = hookLoader;
        if (conf == null) {
            conf = new HiveConf(HiveMetaStoreClient.class);
        }

        this.conf = conf;
        this.filterHook = this.loadFilterHooks();
//        this.fileMetadataBatchSize = HiveConf.getIntVar(conf, ConfVars.METASTORE_BATCH_RETRIEVE_OBJECTS_MAX);
        String msUri = conf.getVar(ConfVars.METASTOREURIS);
        this.localMetaStore = HiveConfUtil.isEmbeddedMetaStore(msUri);
        if (this.localMetaStore) {
            if (!allowEmbedded) {
                throw new MetaException("Embedded metastore is not allowed here. Please configure " + ConfVars.METASTOREURIS.varname + "; it is currently set to [" + msUri + "]");
            } else {
                if (conf.getBoolVar(ConfVars.METASTORE_FASTPATH)) {
                    this.client = new HMSHandler("hive client", conf, true);
                    this.fastpath = true;
                } else {
                    this.client = HiveMetaStore.newRetryingHMSHandler("hive client", conf, true);
                }

                this.isConnected = true;
                this.snapshotActiveConf();
            }
        } else if (conf.getBoolVar(ConfVars.METASTORE_FASTPATH)) {
            throw new RuntimeException("You can't set hive.metastore.fastpath to true when you're talking to the thrift metastore service.  You must run the metastore locally.");
        } else {
            this.retries = HiveConf.getIntVar(conf, ConfVars.METASTORETHRIFTCONNECTIONRETRIES);
            this.retryDelaySeconds = conf.getTimeVar(ConfVars.METASTORE_CLIENT_CONNECT_RETRY_DELAY, TimeUnit.SECONDS);
            if (conf.getVar(ConfVars.METASTOREURIS) != null) {
                String[] metastoreUrisString = conf.getVar(ConfVars.METASTOREURIS).split(",");
                this.metastoreUris = new URI[metastoreUrisString.length];

                try {
                    int i = 0;
                    String[] var7 = metastoreUrisString;
                    int var8 = metastoreUrisString.length;

                    for(int var9 = 0; var9 < var8; ++var9) {
                        String s = var7[var9];
                        URI tmpUri = new URI(s);
                        if (tmpUri.getScheme() == null) {
                            throw new IllegalArgumentException("URI: " + s + " does not have a scheme");
                        }

                        this.metastoreUris[i++] = tmpUri;
                    }

//                    List uriList = Arrays.asList(this.metastoreUris);

                    List<URI> uriList = Arrays.asList(metastoreUris);
                    Collections.shuffle(uriList);
//                    this.metastoreUris = (URI[])((URI[])uriList.toArray());
//                    this.metastoreUris = (URI[]) uriList.toArray(new URL[0]);

                    metastoreUris = uriList.toArray(metastoreUris);


                } catch (IllegalArgumentException var12) {
                    throw var12;
                } catch (Exception var13) {
//                    MetaStoreUtils.logAndThrowMetaException(var13);
                }

                this.open();
            } else {
                LOG.error("NOT getting uris from conf");
                throw new MetaException("MetaStoreURIs not found in conf file");
            }
        }
    }

    private MetaStoreFilterHook loadFilterHooks() throws IllegalStateException {
        Class<? extends MetaStoreFilterHook> authProviderClass = this.conf.getClass(ConfVars.METASTORE_FILTER_HOOK.varname, DefaultMetaStoreFilterHookImpl.class, MetaStoreFilterHook.class);
        String msg = "Unable to create instance of " + authProviderClass.getName() + ": ";

        try {
            Constructor<? extends MetaStoreFilterHook> constructor = authProviderClass.getConstructor(HiveConf.class);
            return (MetaStoreFilterHook)constructor.newInstance(this.conf);
        } catch (NoSuchMethodException var4) {
            throw new IllegalStateException(msg + var4.getMessage(), var4);
        } catch (SecurityException var5) {
            throw new IllegalStateException(msg + var5.getMessage(), var5);
        } catch (InstantiationException var6) {
            throw new IllegalStateException(msg + var6.getMessage(), var6);
        } catch (IllegalAccessException var7) {
            throw new IllegalStateException(msg + var7.getMessage(), var7);
        } catch (IllegalArgumentException var8) {
            throw new IllegalStateException(msg + var8.getMessage(), var8);
        } catch (InvocationTargetException var9) {
            throw new IllegalStateException(msg + var9.getMessage(), var9);
        }
    }

    private void promoteRandomMetaStoreURI() {
        if (this.metastoreUris.length > 1) {
//            Random rng = new Random();
            SecureRandom rng = new SecureRandom();
            int index = rng.nextInt(this.metastoreUris.length - 1) + 1;
            URI tmp = this.metastoreUris[0];
            this.metastoreUris[0] = this.metastoreUris[index];
            this.metastoreUris[index] = tmp;
        }
    }

    @VisibleForTesting
    public TTransport getTTransport() {
        return this.transport;
    }

    @Override
    public boolean isLocalMetaStore() {
        return this.localMetaStore;
    }

    @Override
    public boolean isCompatibleWith(HiveConf conf) {
        Map<String, String> currentMetaVarsCopy = this.currentMetaVars;
        if (currentMetaVarsCopy == null) {
            return false;
        } else {
            boolean compatible = true;
            ConfVars[] var4 = HiveConf.metaVars;
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                ConfVars oneVar = var4[var6];
                String oldVar = (String)currentMetaVarsCopy.get(oneVar.varname);
                String newVar = conf.get(oneVar.varname, "");
                if (oldVar != null) {
                    if (oneVar.isCaseSensitive()) {
                        if (oldVar.equals(newVar)) {
                            continue;
                        }
                    } else if (oldVar.equalsIgnoreCase(newVar)) {
                        continue;
                    }
                }

                LOG.info("Mestastore configuration " + oneVar.varname + " changed from " + oldVar + " to " + newVar);
                compatible = false;
            }

            return compatible;
        }
    }

    @Override
    public void setHiveAddedJars(String addedJars) {
        HiveConf.setVar(this.conf, ConfVars.HIVEADDEDJARS, addedJars);
    }

    @Override
    public void reconnect() throws MetaException {
        if (this.localMetaStore) {
            throw new MetaException("For direct MetaStore DB connections, we don't support retries at the client level.");
        } else {
            this.close();
            this.promoteRandomMetaStoreURI();
            this.open();
        }
    }

    @Override
    public void alter_table(String dbname, String tbl_name, Table new_tbl) throws TException {
        this.alter_table_with_environmentContext(dbname, tbl_name, new_tbl, (EnvironmentContext)null);
    }

    @Override
    public void alter_table_with_environmentContext(String dbname, String tbl_name, Table new_tbl, EnvironmentContext envContext) throws  TException {
        this.client.alter_table_with_environment_context(dbname, tbl_name, new_tbl, envContext);
    }

    @Override
    public void renamePartition(String dbname, String name, List<String> part_vals, Partition newPart) throws  TException {
        this.client.rename_partition(dbname, name, part_vals, newPart);
    }

    private void open() throws MetaException {
        this.isConnected = false;
        TTransportException tte = null;
        boolean useSasl = this.conf.getBoolVar(ConfVars.METASTORE_USE_THRIFT_SASL);
        boolean useFramedTransport = this.conf.getBoolVar(ConfVars.METASTORE_USE_THRIFT_FRAMED_TRANSPORT);
        boolean useCompactProtocol = this.conf.getBoolVar(ConfVars.METASTORE_USE_THRIFT_COMPACT_PROTOCOL);
        int clientSocketTimeout = (int)this.conf.getTimeVar(ConfVars.METASTORE_CLIENT_SOCKET_TIMEOUT, TimeUnit.MILLISECONDS);

        for(int attempt = 0; !this.isConnected && attempt < this.retries; ++attempt) {
            URI[] var7 = this.metastoreUris;
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
                URI store = var7[var9];
                LOG.info("Trying to connect to metastore with URI " + store);

                this.transport = new TSocket(store.getHost(), store.getPort(), clientSocketTimeout);
                if (useSasl) {
                    try {
                        Client authBridge = ShimLoader.getHadoopThriftAuthBridge().createClient();
                        String tokenSig = this.conf.getVar(ConfVars.METASTORE_TOKEN_SIGNATURE);
                        this.tokenStrForm = Utils.getTokenStrForm(tokenSig);
                        if (this.tokenStrForm != null) {
                            this.transport = authBridge.createClientTransport((String)null, store.getHost(), "DIGEST", this.tokenStrForm, this.transport, MetaStoreUtils.getMetaStoreSaslProperties(this.conf));
                        } else {
                            String principalConfig = this.conf.getVar(ConfVars.METASTORE_KERBEROS_PRINCIPAL);
                            this.transport = authBridge.createClientTransport(principalConfig, store.getHost(), "KERBEROS", (String)null, this.transport, MetaStoreUtils.getMetaStoreSaslProperties(this.conf));
                        }
                    } catch (IOException var18) {
                        LOG.error("Couldn't create client transport", var18);

//                            throw new MetaException(var18.toString());
                        throw new CsiiRuntimeException("Couldn't create client transport",var18);
                    }
                } else if (useFramedTransport) {
                    this.transport = new TFramedTransport(this.transport);
                }

                Object protocol;
                if (useCompactProtocol) {
                    protocol = new TCompactProtocol(this.transport);
                } else {
                    protocol = new TBinaryProtocol(this.transport);
                }

                this.client = new ThriftHiveMetastore.Client((TProtocol)protocol);

                try {
                    this.transport.open();
                    LOG.info("Opened a connection to metastore, current connections: " + connCount.incrementAndGet());
                    this.isConnected = true;
                } catch (TTransportException var19) {
                    tte = var19;
                    if (LOG.isDebugEnabled()) {
                        LOG.warn("Failed to connect to the MetaStore Server...", var19);
                    } else {
                        LOG.warn("Failed to connect to the MetaStore Server...");
                    }
                }

                if (this.isConnected && !useSasl && this.conf.getBoolVar(ConfVars.METASTORE_EXECUTE_SET_UGI)) {
                    try {
                        UserGroupInformation ugi = Utils.getUGI();
                        this.client.set_ugi(ugi.getUserName(), Arrays.asList(ugi.getGroupNames()));
                    } catch (LoginException var15) {
                        LOG.warn("Failed to do login. set_ugi() is not successful, Continuing without it.", var15);
                    } catch (IOException var16) {
                        LOG.warn("Failed to find ugi of client set_ugi() is not successful, Continuing without it.", var16);
                    } catch (TException var17) {
                        LOG.warn("set_ugi() not successful, Likely cause: new client talking to old server. Continuing without it.", var17);
                    }
                }

                if (this.isConnected) {
                    break;
                }
            }

            if (!this.isConnected && this.retryDelaySeconds > 0L) {

                try {
                    LOG.info("Waiting " + this.retryDelaySeconds + " seconds before next connection attempt.");
                    Thread.sleep(this.retryDelaySeconds * 1000L);
                } catch (InterruptedException e) {
                    LOG.error("connect fail",e);
                    Thread.currentThread().interrupt();
                }
            }
        }

        if (!this.isConnected) {
            throw new MetaException("Could not connect to meta store using any of the URIs provided. Most recent failure: " + StringUtils.stringifyException(tte));
        } else {
            this.snapshotActiveConf();
            LOG.info("Connected to metastore.");
        }
    }

    private void snapshotActiveConf() {
        this.currentMetaVars = new HashMap(HiveConf.metaVars.length);
        ConfVars[] var1 = HiveConf.metaVars;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ConfVars oneVar = var1[var3];
            this.currentMetaVars.put(oneVar.varname, this.conf.get(oneVar.varname, ""));
        }

    }

    @Override
    public String getTokenStrForm() throws IOException {
        return this.tokenStrForm;
    }

    @Override
    public void close() {
        this.isConnected = false;
        this.currentMetaVars = null;

        try {
            if (null != this.client) {
                this.client.shutdown();
            }
        } catch (TException var2) {
            LOG.debug("Unable to shutdown metastore client. Will try closing transport directly.", var2);
        }

        if (this.transport != null && this.transport.isOpen()) {
            this.transport.close();
            LOG.info("Closed a connection to metastore, current connections: " + connCount.decrementAndGet());
        }

    }

    @Override
    public void setMetaConf(String key, String value) throws TException {
        this.client.setMetaConf(key, value);
    }

    @Override
    public String getMetaConf(String key) throws TException {
        return this.client.getMetaConf(key);
    }

    @Override
    public Partition add_partition(Partition new_part) throws TException {
        return this.add_partition(new_part, (EnvironmentContext)null);
    }

    public Partition add_partition(Partition new_part, EnvironmentContext envContext) throws   TException {
        Partition p = this.client.add_partition_with_environment_context(new_part, envContext);
        return this.fastpath ? p : this.deepCopy(p);
    }

    @Override
    public int add_partitions(List<Partition> new_parts) throws TException {
        return this.client.add_partitions(new_parts);
    }

    @Override
    public List<Partition> add_partitions(List<Partition> parts, boolean ifNotExists, boolean needResults) throws TException {
        if (parts.isEmpty()) {
            return needResults ? new ArrayList() : null;
        } else {
            Partition part = (Partition)parts.get(0);
            AddPartitionsRequest req = new AddPartitionsRequest(part.getDbName(), part.getTableName(), parts, ifNotExists);
            req.setNeedResult(needResults);
            AddPartitionsResult result = this.client.add_partitions_req(req);
            return needResults ? this.filterHook.filterPartitions(result.getPartitions()) : null;
        }
    }

    @Override
    public int add_partitions_pspec(PartitionSpecProxy partitionSpec) throws TException {
        return this.client.add_partitions_pspec(partitionSpec.toPartitionSpec());
    }

    @Override
    public Partition appendPartition(String db_name, String table_name, List<String> part_vals) throws TException {
        return this.appendPartition(db_name, table_name, (List)part_vals, (EnvironmentContext)null);
    }

    public Partition appendPartition(String db_name, String table_name, List<String> part_vals, EnvironmentContext envContext) throws  TException {
        Partition p = this.client.append_partition_with_environment_context(db_name, table_name, part_vals, envContext);
        return this.fastpath ? p : this.deepCopy(p);
    }

    @Override
    public Partition appendPartition(String dbName, String tableName, String partName) throws  TException {
        return this.appendPartition(dbName, tableName, (String)partName, (EnvironmentContext)null);
    }

    public Partition appendPartition(String dbName, String tableName, String partName, EnvironmentContext envContext) throws  TException {
        Partition p = this.client.append_partition_by_name_with_environment_context(dbName, tableName, partName, envContext);
        return this.fastpath ? p : this.deepCopy(p);
    }

    @Override
    public Partition exchange_partition(Map<String, String> partitionSpecs, String sourceDb, String sourceTable, String destDb, String destinationTableName) throws TException {
        return this.client.exchange_partition(partitionSpecs, sourceDb, sourceTable, destDb, destinationTableName);
    }

    @Override
    public List<Partition> exchange_partitions(Map<String, String> partitionSpecs, String sourceDb, String sourceTable, String destDb, String destinationTableName) throws TException {
        return this.client.exchange_partitions(partitionSpecs, sourceDb, sourceTable, destDb, destinationTableName);
    }

    @Override
    public void validatePartitionNameCharacters(List<String> partVals) throws TException {
        this.client.partition_name_has_valid_characters(partVals, true);
    }

    @Override
    public void createDatabase(Database db) throws  TException {
        this.client.create_database(db);
    }

    @Override
    public void createTable(Table tbl) throws TException {
        this.createTable(tbl, (EnvironmentContext)null);
    }

    public void createTable(Table tbl, EnvironmentContext envContext) throws TException {
        HiveMetaHook hook = this.getHook(tbl);
        if (hook != null) {
            hook.preCreateTable(tbl);
        }

        boolean success = false;

        try {
            this.create_table_with_environment_context(tbl, envContext);
            if (hook != null) {
                hook.commitCreateTable(tbl);
            }

            success = true;
        } finally {
            if (!success && hook != null) {
                hook.rollbackCreateTable(tbl);
            }

        }

    }

    @Override
    public void createTableWithConstraints(Table tbl, List<SQLPrimaryKey> primaryKeys, List<SQLForeignKey> foreignKeys) throws TException {
        HiveMetaHook hook = this.getHook(tbl);
        if (hook != null) {
            hook.preCreateTable(tbl);
        }

        boolean success = false;

        try {
            this.client.create_table_with_constraints(tbl, primaryKeys, foreignKeys);
            if (hook != null) {
                hook.commitCreateTable(tbl);
            }

            success = true;
        } finally {
            if (!success && hook != null) {
                hook.rollbackCreateTable(tbl);
            }

        }

    }

    @Override
    public void dropConstraint(String dbName, String tableName, String constraintName) throws TException {
        this.client.drop_constraint(new DropConstraintRequest(dbName, tableName, constraintName));
    }

    @Override
    public void addPrimaryKey(List<SQLPrimaryKey> primaryKeyCols) throws  TException {
        this.client.add_primary_key(new AddPrimaryKeyRequest(primaryKeyCols));
    }

    @Override
    public void addForeignKey(List<SQLForeignKey> foreignKeyCols) throws TException {
        this.client.add_foreign_key(new AddForeignKeyRequest(foreignKeyCols));
    }

    public boolean createType(Type type) throws TException {
        return this.client.create_type(type);
    }

    @Override
    public void dropDatabase(String name) throws  TException {
        this.dropDatabase(name, true, false, false);
    }

    @Override
    public void dropDatabase(String name, boolean deleteData, boolean ignoreUnknownDb) throws  TException {
        this.dropDatabase(name, deleteData, ignoreUnknownDb, false);
    }

    @Override
    public void dropDatabase(String name, boolean deleteData, boolean ignoreUnknownDb, boolean cascade) throws   TException {
        try {
            this.getDatabase(name);
        } catch (NoSuchObjectException var10) {
            if (!ignoreUnknownDb) {
                throw var10;
            }

            return;
        }

        if (cascade) {
            List<String> tableList = this.getAllTables(name);
            Iterator var6 = tableList.iterator();

            while(var6.hasNext()) {
                String table = (String)var6.next();

                try {
                    this.dropTable(name, table, deleteData, true);
                } catch (UnsupportedOperationException var9) {
                }
            }
        }

        this.client.drop_database(name, deleteData, cascade);
    }

    public boolean dropPartition(String db_name, String tbl_name, List<String> part_vals) throws  TException {
        return this.dropPartition(db_name, tbl_name, (List)part_vals, true, (EnvironmentContext)null);
    }

    public boolean dropPartition(String db_name, String tbl_name, List<String> part_vals, EnvironmentContext env_context) throws  TException {
        return this.dropPartition(db_name, tbl_name, part_vals, true, env_context);
    }

    @Override
    public boolean dropPartition(String dbName, String tableName, String partName, boolean deleteData) throws  TException {
        return this.dropPartition(dbName, tableName, (String)partName, deleteData, (EnvironmentContext)null);
    }

    private static EnvironmentContext getEnvironmentContextWithIfPurgeSet() {
        Map<String, String> warehouseOptions = new HashMap();
        warehouseOptions.put("ifPurge", "TRUE");
        return new EnvironmentContext(warehouseOptions);
    }

    public boolean dropPartition(String dbName, String tableName, String partName, boolean deleteData, EnvironmentContext envContext) throws  TException {
        return this.client.drop_partition_by_name_with_environment_context(dbName, tableName, partName, deleteData, envContext);
    }

    @Override
    public boolean dropPartition(String db_name, String tbl_name, List<String> part_vals, boolean deleteData) throws TException {
        return this.dropPartition(db_name, tbl_name, (List)part_vals, deleteData, (EnvironmentContext)null);
    }

    @Override
    public boolean dropPartition(String db_name, String tbl_name, List<String> part_vals, PartitionDropOptions options) throws TException {
        return this.dropPartition(db_name, tbl_name, part_vals, options.deleteData, options.purgeData ? getEnvironmentContextWithIfPurgeSet() : null);
    }

    public boolean dropPartition(String db_name, String tbl_name, List<String> part_vals, boolean deleteData, EnvironmentContext envContext) throws   TException {
        return this.client.drop_partition_with_environment_context(db_name, tbl_name, part_vals, deleteData, envContext);
    }

    @Override
    public List<Partition> dropPartitions(String dbName, String tblName, List<ObjectPair<Integer, byte[]>> partExprs, PartitionDropOptions options) throws TException {
        RequestPartsSpec rps = new RequestPartsSpec();
        List<DropPartitionsExpr> exprs = new ArrayList(partExprs.size());
        Iterator var7 = partExprs.iterator();

        while(var7.hasNext()) {
            ObjectPair<Integer, byte[]> partExpr = (ObjectPair)var7.next();
            DropPartitionsExpr dpe = new DropPartitionsExpr();
            dpe.setExpr((byte[])partExpr.getSecond());
            dpe.setPartArchiveLevel((Integer)partExpr.getFirst());
            exprs.add(dpe);
        }

        rps.setExprs(exprs);
        DropPartitionsRequest req = new DropPartitionsRequest(dbName, tblName, rps);
        req.setDeleteData(options.deleteData);
        req.setNeedResult(options.returnResults);
        req.setIfExists(options.ifExists);
        if (options.purgeData) {
            LOG.info("Dropped partitions will be purged!");
            req.setEnvironmentContext(getEnvironmentContextWithIfPurgeSet());
        }

        return this.client.drop_partitions_req(req).getPartitions();
    }

    @Override
    public List<Partition> dropPartitions(String dbName, String tblName, List<ObjectPair<Integer, byte[]>> partExprs, boolean deleteData, boolean ifExists, boolean needResult) throws   TException {
        return this.dropPartitions(dbName, tblName, partExprs, PartitionDropOptions.instance().deleteData(deleteData).ifExists(ifExists).returnResults(needResult));
    }

    @Override
    public List<Partition> dropPartitions(String dbName, String tblName, List<ObjectPair<Integer, byte[]>> partExprs, boolean deleteData, boolean ifExists) throws  TException {
        return this.dropPartitions(dbName, tblName, partExprs, PartitionDropOptions.instance().deleteData(deleteData).ifExists(ifExists));
    }

    @Override
    public void dropTable(String dbname, String name, boolean deleteData, boolean ignoreUnknownTab) throws  TException,  UnsupportedOperationException {
        this.dropTable(dbname, name, deleteData, ignoreUnknownTab, (EnvironmentContext)null);
    }

    @Override
    public void dropTable(String dbname, String name, boolean deleteData, boolean ignoreUnknownTab, boolean ifPurge) throws  TException,  UnsupportedOperationException {
        EnvironmentContext envContext = null;
        if (ifPurge) {
            Map<String, String> warehouseOptions = null;
            warehouseOptions = new HashMap();
            warehouseOptions.put("ifPurge", "TRUE");
            envContext = new EnvironmentContext(warehouseOptions);
        }

        this.dropTable(dbname, name, deleteData, ignoreUnknownTab, envContext);
    }

    /** @deprecated */
    @Override
    @Deprecated
    public void dropTable(String tableName, boolean deleteData) throws  TException {
        this.dropTable("default", tableName, deleteData, false, (EnvironmentContext)null);
    }

    @Override
    public void dropTable(String dbname, String name) throws TException {
        this.dropTable(dbname, name, true, true, (EnvironmentContext)null);
    }

    public void dropTable(String dbname, String name, boolean deleteData, boolean ignoreUnknownTab, EnvironmentContext envContext) throws  TException,  UnsupportedOperationException {
        Table tbl;
        try {
            tbl = this.getTable(dbname, name);
        } catch (NoSuchObjectException var14) {
            if (!ignoreUnknownTab) {
                throw var14;
            }

            return;
        }

        if (MetaStoreUtils.isIndexTable(tbl)) {
            throw new UnsupportedOperationException("Cannot drop index tables");
        } else {
            HiveMetaHook hook = this.getHook(tbl);
            if (hook != null) {
                hook.preDropTable(tbl);
            }

            boolean success = false;

            try {
                this.drop_table_with_environment_context(dbname, name, deleteData, envContext);
                if (hook != null) {
                    hook.commitDropTable(tbl, deleteData);
                }

                success = true;
            } catch (NoSuchObjectException var15) {
                if (!ignoreUnknownTab) {
                    throw var15;
                }
            } finally {
                if (!success && hook != null) {
                    hook.rollbackDropTable(tbl);
                }

            }

        }
    }

    public boolean dropType(String type) throws   TException {
        return this.client.drop_type(type);
    }


    @Override
    public List<String> getDatabases(String databasePattern) {
        try {
            return this.filterHook.filterDatabases(this.client.get_databases(databasePattern));
        } catch (Exception var3) {
            throw new CsiiRuntimeException("database fail",var3);

        }
    }

    @Override
    public List<String> getAllDatabases()  {
        try {
            return this.filterHook.filterDatabases(this.client.get_all_databases());
        } catch (Exception var2) {
            throw new CsiiRuntimeException("database fail",var2);
        }
    }

    @Override
    public List<Partition> listPartitions(String db_name, String tbl_name, short max_parts) throws TException {
        List<Partition> parts = this.client.get_partitions(db_name, tbl_name, max_parts);
        return this.fastpath ? parts : this.deepCopyPartitions(this.filterHook.filterPartitions(parts));
    }

    @Override
    public PartitionSpecProxy listPartitionSpecs(String dbName, String tableName, int maxParts) throws TException {
        return PartitionSpecProxy.Factory.get(this.filterHook.filterPartitionSpecs(this.client.get_partitions_pspec(dbName, tableName, maxParts)));
    }

    @Override
    public List<Partition> listPartitions(String db_name, String tbl_name, List<String> part_vals, short max_parts) throws TException {
        List<Partition> parts = this.client.get_partitions_ps(db_name, tbl_name, part_vals, max_parts);
        return this.fastpath ? parts : this.deepCopyPartitions(this.filterHook.filterPartitions(parts));
    }

    @Override
    public List<Partition> listPartitionsWithAuthInfo(String db_name, String tbl_name, short max_parts, String user_name, List<String> group_names) throws   TException {
        List<Partition> parts = this.client.get_partitions_with_auth(db_name, tbl_name, max_parts, user_name, group_names);
        return this.fastpath ? parts : this.deepCopyPartitions(this.filterHook.filterPartitions(parts));
    }

    @Override
    public List<Partition> listPartitionsWithAuthInfo(String db_name, String tbl_name, List<String> part_vals, short max_parts, String user_name, List<String> group_names) throws TException {
        List<Partition> parts = this.client.get_partitions_ps_with_auth(db_name, tbl_name, part_vals, max_parts, user_name, group_names);
        return this.fastpath ? parts : this.deepCopyPartitions(this.filterHook.filterPartitions(parts));
    }

    @Override
    public List<Partition> listPartitionsByFilter(String db_name, String tbl_name, String filter, short max_parts) throws TException {
        List<Partition> parts = this.client.get_partitions_by_filter(db_name, tbl_name, filter, max_parts);
        return this.fastpath ? parts : this.deepCopyPartitions(this.filterHook.filterPartitions(parts));
    }

    @Override
    public PartitionSpecProxy listPartitionSpecsByFilter(String db_name, String tbl_name, String filter, int max_parts) throws  TException {
        return PartitionSpecProxy.Factory.get(this.filterHook.filterPartitionSpecs(this.client.get_part_specs_by_filter(db_name, tbl_name, filter, max_parts)));
    }

    @Override
    public boolean listPartitionsByExpr(String db_name, String tbl_name, byte[] expr, String default_partition_name, short max_parts, List<Partition> result) throws TException {
        assert result != null;

        PartitionsByExprRequest req = new PartitionsByExprRequest(db_name, tbl_name, ByteBuffer.wrap(expr));
        if (default_partition_name != null) {
            req.setDefaultPartitionName(default_partition_name);
        }

        if (max_parts >= 0) {
            req.setMaxParts(max_parts);
        }

        PartitionsByExprResult r = null;

        try {
            r = this.client.get_partitions_by_expr(req);
        } catch (TApplicationException var10) {
            if (var10.getType() != 1 && var10.getType() != 3) {
                throw var10;
            }

            throw new CsiiRuntimeException("Metastore doesn't support listPartitionsByExpr: " , var10);
        }

        if (this.fastpath) {
            result.addAll(r.getPartitions());
        } else {
            r.setPartitions(this.filterHook.filterPartitions(r.getPartitions()));
            this.deepCopyPartitions(r.getPartitions(), result);
        }

        return !r.isSetHasUnknownPartitions() || r.isHasUnknownPartitions();
    }

    @Override
    public Database getDatabase(String name) throws  TException {
        Database d = this.client.get_database(name);
        return this.fastpath ? d : this.deepCopy(this.filterHook.filterDatabase(d));
    }

    @Override
    public Partition getPartition(String db_name, String tbl_name, List<String> part_vals) throws  TException {
        Partition p = this.client.get_partition(db_name, tbl_name, part_vals);
        return this.fastpath ? p : this.deepCopy(this.filterHook.filterPartition(p));
    }

    @Override
    public List<Partition> getPartitionsByNames(String db_name, String tbl_name, List<String> part_names) throws  TException {
        List<Partition> parts = this.client.get_partitions_by_names(db_name, tbl_name, part_names);
        return this.fastpath ? parts : this.deepCopyPartitions(this.filterHook.filterPartitions(parts));
    }

    @Override
    public Partition getPartitionWithAuthInfo(String db_name, String tbl_name, List<String> part_vals, String user_name, List<String> group_names) throws TException {
        Partition p = this.client.get_partition_with_auth(db_name, tbl_name, part_vals, user_name, group_names);
        return this.fastpath ? p : this.deepCopy(this.filterHook.filterPartition(p));
    }

    @Override
    public Table getTable(String dbname, String name) throws TException {
        Table t = this.client.get_table(dbname, name);
        return this.fastpath ? t : this.deepCopy(this.filterHook.filterTable(t));
    }

    /** @deprecated */
    @Override
    @Deprecated
    public Table getTable(String tableName) throws TException{
        Table t = this.getTable("default", tableName);
        return this.fastpath ? t : this.filterHook.filterTable(t);
    }

    @Override
    public List<Table> getTableObjectsByName(String dbName, List<String> tableNames) throws TException {
        List<Table> tabs = this.client.get_table_objects_by_name(dbName, tableNames);
        return this.fastpath ? tabs : this.deepCopyTables(this.filterHook.filterTables(tabs));
    }

    @Override
    public List<String> listTableNamesByFilter(String dbName, String filter, short maxTables) throws TException {
        return this.filterHook.filterTableNames(dbName, this.client.get_table_names_by_filter(dbName, filter, maxTables));
    }

    public Type getType(String name) throws TException {
        return this.deepCopy(this.client.get_type(name));
    }

    @Override
    public List<String> getTables(String dbname, String tablePattern)  {
        try {
            return this.filterHook.filterTableNames(dbname, this.client.get_tables(dbname, tablePattern));
        } catch (Exception var4) {
            throw new CsiiRuntimeException("table fail",var4);
        }
    }

    @Override
    public List<TableMeta> getTableMeta(String dbPatterns, String tablePatterns, List<String> tableTypes)   {
        try {
            return this.filterNames(this.client.get_table_meta(dbPatterns, tablePatterns, tableTypes));
        } catch (Exception var5) {
            throw new CsiiRuntimeException("table fail",var5);
        }
    }

    private List<TableMeta> filterNames(List<TableMeta> metas) throws MetaException {
        Map<String, TableMeta> sources = new LinkedHashMap(128);
        Map<String, List<String>> dbTables = new LinkedHashMap(128);

        TableMeta meta;
        List<String > tables;
        for(Iterator var4 = metas.iterator(); var4.hasNext(); tables.add(meta.getTableName())) {
            meta = (TableMeta)var4.next();
            StringBuilder metaBuilder = new StringBuilder();
            metaBuilder.append(meta.getDbName());
            metaBuilder.append('.');
            metaBuilder.append(meta.getTableName());
//            sources.put(meta.getDbName() + "." + meta.getTableName(), meta);
            sources.put(metaBuilder.toString(), meta);
            tables = dbTables.get(meta.getDbName());
            if (tables == null) {
                dbTables.put(meta.getDbName(), tables = new ArrayList());
            }
        }

        List<TableMeta> filtered = new ArrayList();
        Iterator var10 = dbTables.entrySet().iterator();

        while(var10.hasNext()) {
            Map.Entry<String, List<String>> entry = (Map.Entry)var10.next();
            Iterator var7 = this.filterHook.filterTableNames((String)entry.getKey(), (List)entry.getValue()).iterator();

            while(var7.hasNext()) {
                String table = (String)var7.next();
                filtered.add(sources.get((String)entry.getKey() + "." + table));
            }
        }

        return filtered;
    }

    @Override
    public List<String> getAllTables(String dbname) throws MetaException {
        try {
            return this.filterHook.filterTableNames(dbname, this.client.get_all_tables(dbname));
        } catch (Exception var3) {
            throw new CsiiRuntimeException("table fail",var3);
        }
    }

    @Override
    public boolean tableExists(String databaseName, String tableName) throws TException {
        try {
            return this.filterHook.filterTable(this.client.get_table(databaseName, tableName)) != null;
        } catch (NoSuchObjectException var4) {
            return false;
        }
    }

    /** @deprecated */
    @Override
    @Deprecated
    public boolean tableExists(String tableName) throws  TException {
        return this.tableExists("default", tableName);
    }

    @Override
    public List<String> listPartitionNames(String dbName, String tblName, short max) throws TException {
        return this.filterHook.filterPartitionNames(dbName, tblName, this.client.get_partition_names(dbName, tblName, max));
    }

    @Override
    public List<String> listPartitionNames(String db_name, String tbl_name, List<String> part_vals, short max_parts) throws TException {
        return this.filterHook.filterPartitionNames(db_name, tbl_name, this.client.get_partition_names_ps(db_name, tbl_name, part_vals, max_parts));
    }

    @Override
    public int getNumPartitionsByFilter(String db_name, String tbl_name, String filter) throws TException {
        return this.client.get_num_partitions_by_filter(db_name, tbl_name, filter);
    }

    @Override
    public void alter_partition(String dbName, String tblName, Partition newPart, EnvironmentContext environmentContext) throws TException {
        this.client.alter_partition_with_environment_context(dbName, tblName, newPart, environmentContext);
    }

    @Override
    public void alter_partitions(String dbName, String tblName, List<Partition> newParts, EnvironmentContext environmentContext) throws TException {
        this.client.alter_partitions_with_environment_context(dbName, tblName, newParts, environmentContext);
    }

    @Override
    public void alterDatabase(String dbName, Database db) throws TException {
        this.client.alter_database(dbName, db);
    }

    @Override
    public List<FieldSchema> getFields(String db, String tableName) throws  TException  {
        List<FieldSchema> fields = this.client.get_fields(db, tableName);
        return this.fastpath ? fields : this.deepCopyFieldSchemas(fields);
    }

    @Override
    public void createIndex(Index index, Table indexTable) throws TException {
        this.client.add_index(index, indexTable);
    }

    @Override
    public void alter_index(String dbname, String base_tbl_name, String idx_name, Index new_idx) throws TException {
        this.client.alter_index(dbname, base_tbl_name, idx_name, new_idx);
    }

    @Override
    public Index getIndex(String dbName, String tblName, String indexName) throws   TException {
        return this.deepCopy(this.filterHook.filterIndex(this.client.get_index_by_name(dbName, tblName, indexName)));
    }

    @Override
    public List<String> listIndexNames(String dbName, String tblName, short max) throws  TException {
        return this.filterHook.filterIndexNames(dbName, tblName, this.client.get_index_names(dbName, tblName, max));
    }

    @Override
    public List<Index> listIndexes(String dbName, String tblName, short max) throws TException {
        return this.filterHook.filterIndexes(this.client.get_indexes(dbName, tblName, max));
    }

    @Override
    public List<SQLPrimaryKey> getPrimaryKeys(PrimaryKeysRequest req) throws  TException {
        return this.client.get_primary_keys(req).getPrimaryKeys();
    }

    @Override
    public List<SQLForeignKey> getForeignKeys(ForeignKeysRequest req) throws TException {
        return this.client.get_foreign_keys(req).getForeignKeys();
    }

    /** @deprecated */
    @Override
    @Deprecated
    public boolean updateTableColumnStatistics(ColumnStatistics statsObj) throws  TException {
        return this.client.update_table_column_statistics(statsObj);
    }

    /** @deprecated */
    @Override
    @Deprecated
    public boolean updatePartitionColumnStatistics(ColumnStatistics statsObj) throws  TException {
        return this.client.update_partition_column_statistics(statsObj);
    }

    @Override
    public boolean setPartitionColumnStatistics(SetPartitionsStatsRequest request) throws TException {
        return this.client.set_aggr_stats_for(request);
    }

    @Override
    public void flushCache() {
        try {
            this.client.flushCache();
        } catch (TException var2) {
            LOG.warn("Got error flushing the cache", var2);
        }

    }

    @Override
    public List<ColumnStatisticsObj> getTableColumnStatistics(String dbName, String tableName, List<String> colNames) throws TException {
        return this.client.get_table_statistics_req(new TableStatsRequest(dbName, tableName, colNames)).getTableStats();
    }

    @Override
    public Map<String, List<ColumnStatisticsObj>> getPartitionColumnStatistics(String dbName, String tableName, List<String> partNames, List<String> colNames) throws TException {
        return this.client.get_partitions_statistics_req(new PartitionsStatsRequest(dbName, tableName, colNames, partNames)).getPartStats();
    }

    @Override
    public boolean deletePartitionColumnStatistics(String dbName, String tableName, String partName, String colName) throws  TException {
        return this.client.delete_partition_column_statistics(dbName, tableName, partName, colName);
    }

    @Override
    public boolean deleteTableColumnStatistics(String dbName, String tableName, String colName) throws TException {
        return this.client.delete_table_column_statistics(dbName, tableName, colName);
    }

    @Override
    public List<FieldSchema> getSchema(String db, String tableName) throws  TException{
        EnvironmentContext envCxt = null;
        String addedJars = this.conf.getVar(ConfVars.HIVEADDEDJARS);
        if (org.apache.commons.lang.StringUtils.isNotBlank(addedJars)) {
            Map<String, String> props = new HashMap();
            props.put("hive.added.jars.path", addedJars);
            envCxt = new EnvironmentContext(props);
        }

        List<FieldSchema> fields = this.client.get_schema_with_environment_context(db, tableName, envCxt);
        return this.fastpath ? fields : this.deepCopyFieldSchemas(fields);
    }

    @Override
    public String getConfigValue(String name, String defaultValue) throws TException {
        return this.client.get_config_value(name, defaultValue);
    }

    @Override
    public Partition getPartition(String db, String tableName, String partName) throws  TException   {
        Partition p = this.client.get_partition_by_name(db, tableName, partName);
        return this.fastpath ? p : this.deepCopy(this.filterHook.filterPartition(p));
    }

    public Partition appendPartitionByName(String dbName, String tableName, String partName) throws  TException {
        return this.appendPartitionByName(dbName, tableName, partName, (EnvironmentContext)null);
    }

    public Partition appendPartitionByName(String dbName, String tableName, String partName, EnvironmentContext envContext) throws  TException {
        Partition p = this.client.append_partition_by_name_with_environment_context(dbName, tableName, partName, envContext);
        return this.fastpath ? p : this.deepCopy(p);
    }

    public boolean dropPartitionByName(String dbName, String tableName, String partName, boolean deleteData) throws TException {
        return this.dropPartitionByName(dbName, tableName, partName, deleteData, (EnvironmentContext)null);
    }

    public boolean dropPartitionByName(String dbName, String tableName, String partName, boolean deleteData, EnvironmentContext envContext) throws  TException {
        return this.client.drop_partition_by_name_with_environment_context(dbName, tableName, partName, deleteData, envContext);
    }

    private HiveMetaHook getHook(Table tbl) throws MetaException {
        return this.hookLoader == null ? null : this.hookLoader.getHook(tbl);
    }

    @Override
    public List<String> partitionNameToVals(String name) throws  TException {
        return this.client.partition_name_to_vals(name);
    }

    @Override
    public Map<String, String> partitionNameToSpec(String name) throws  TException {
        return this.client.partition_name_to_spec(name);
    }

    private Partition deepCopy(Partition partition) {
        Partition copy = null;
        if (partition != null) {
            copy = new Partition(partition);
        }

        return copy;
    }

    private Database deepCopy(Database database) {
        Database copy = null;
        if (database != null) {
            copy = new Database(database);
        }

        return copy;
    }

    protected Table deepCopy(Table table) {
        Table copy = null;
        if (table != null) {
            copy = new Table(table);
        }

        return copy;
    }

    private Index deepCopy(Index index) {
        Index copy = null;
        if (index != null) {
            copy = new Index(index);
        }

        return copy;
    }

    private Type deepCopy(Type type) {
        Type copy = null;
        if (type != null) {
            copy = new Type(type);
        }

        return copy;
    }

    private FieldSchema deepCopy(FieldSchema schema) {
        FieldSchema copy = null;
        if (schema != null) {
            copy = new FieldSchema(schema);
        }

        return copy;
    }

    private Function deepCopy(Function func) {
        Function copy = null;
        if (func != null) {
            copy = new Function(func);
        }

        return copy;
    }

    protected PrincipalPrivilegeSet deepCopy(PrincipalPrivilegeSet pps) {
        PrincipalPrivilegeSet copy = null;
        if (pps != null) {
            copy = new PrincipalPrivilegeSet(pps);
        }

        return copy;
    }

    private List<Partition> deepCopyPartitions(List<Partition> partitions) {
        return this.deepCopyPartitions(partitions, (List)null);
    }

    private List<Partition> deepCopyPartitions(Collection<Partition> src, List<Partition> dest) {
        if (src == null) {
            return (List)dest;
        } else {
            if (dest == null) {
                dest = new ArrayList(src.size());
            }

            Iterator var3 = src.iterator();

            while(var3.hasNext()) {
                Partition part = (Partition)var3.next();
                ((List)dest).add(this.deepCopy(part));
            }

            return (List)dest;
        }
    }

    private List<Table> deepCopyTables(List<Table> tables) {
        List<Table> copy = null;
        if (tables != null) {
            copy = new ArrayList(128);
            Iterator var3 = tables.iterator();

            while(var3.hasNext()) {
                Table tab = (Table)var3.next();
//                copy.add(this.deepCopy(tab));
                copy.add(deepCopy(tab));

            }
        }

        return copy;
    }

    protected List<FieldSchema> deepCopyFieldSchemas(List<FieldSchema> schemas) {
        List<FieldSchema> copy = null;
        if (schemas != null) {
            copy = new ArrayList(128);
            Iterator var3 = schemas.iterator();

            while(var3.hasNext()) {
                FieldSchema schema = (FieldSchema)var3.next();
//                copy.add(this.deepCopy(schema));
                copy.add(deepCopy(schema));
            }
        }

        return copy;
    }

    @Override
    public boolean dropIndex(String dbName, String tblName, String name, boolean deleteData) throws  TException {
        return this.client.drop_index_by_name(dbName, tblName, name, deleteData);
    }

    @Override
    public boolean grant_role(String roleName, String userName, PrincipalType principalType, String grantor, PrincipalType grantorType, boolean grantOption) throws  TException {
        GrantRevokeRoleRequest req = new GrantRevokeRoleRequest();
        req.setRequestType(GrantRevokeType.GRANT);
        req.setRoleName(roleName);
        req.setPrincipalName(userName);
        req.setPrincipalType(principalType);
        req.setGrantor(grantor);
        req.setGrantorType(grantorType);
        req.setGrantOption(grantOption);
        GrantRevokeRoleResponse res = this.client.grant_revoke_role(req);
        if (!res.isSetSuccess()) {
            throw new MetaException("GrantRevokeResponse missing success field");
        } else {
            return res.isSuccess();
        }
    }

    @Override
    public boolean create_role(Role role) throws  TException {
        return this.client.create_role(role);
    }

    @Override
    public boolean drop_role(String roleName) throws  TException {
        return this.client.drop_role(roleName);
    }

    @Override
    public List<Role> list_roles(String principalName, PrincipalType principalType) throws  TException {
        return this.client.list_roles(principalName, principalType);
    }

    @Override
    public List<String> listRoleNames() throws  TException {
        return this.client.get_role_names();
    }

    @Override
    public GetPrincipalsInRoleResponse get_principals_in_role(GetPrincipalsInRoleRequest req) throws  TException {
        return this.client.get_principals_in_role(req);
    }

    @Override
    public GetRoleGrantsForPrincipalResponse get_role_grants_for_principal(GetRoleGrantsForPrincipalRequest getRolePrincReq) throws  TException {
        return this.client.get_role_grants_for_principal(getRolePrincReq);
    }

    @Override
    public boolean grant_privileges(PrivilegeBag privileges) throws  TException {
        GrantRevokePrivilegeRequest req = new GrantRevokePrivilegeRequest();
        req.setRequestType(GrantRevokeType.GRANT);
        req.setPrivileges(privileges);
        GrantRevokePrivilegeResponse res = this.client.grant_revoke_privileges(req);
        if (!res.isSetSuccess()) {
            throw new MetaException("GrantRevokePrivilegeResponse missing success field");
        } else {
            return res.isSuccess();
        }
    }

    @Override
    public boolean revoke_role(String roleName, String userName, PrincipalType principalType, boolean grantOption) throws  TException {
        GrantRevokeRoleRequest req = new GrantRevokeRoleRequest();
        req.setRequestType(GrantRevokeType.REVOKE);
        req.setRoleName(roleName);
        req.setPrincipalName(userName);
        req.setPrincipalType(principalType);
        req.setGrantOption(grantOption);
        GrantRevokeRoleResponse res = this.client.grant_revoke_role(req);
        if (!res.isSetSuccess()) {
            throw new MetaException("GrantRevokeResponse missing success field");
        } else {
            return res.isSuccess();
        }
    }

    @Override
    public boolean revoke_privileges(PrivilegeBag privileges, boolean grantOption) throws  TException {
        GrantRevokePrivilegeRequest req = new GrantRevokePrivilegeRequest();
        req.setRequestType(GrantRevokeType.REVOKE);
        req.setPrivileges(privileges);
        req.setRevokeGrantOption(grantOption);
        GrantRevokePrivilegeResponse res = this.client.grant_revoke_privileges(req);
        if (!res.isSetSuccess()) {
            throw new MetaException("GrantRevokePrivilegeResponse missing success field");
        } else {
            return res.isSuccess();
        }
    }

    @Override
    public PrincipalPrivilegeSet get_privilege_set(HiveObjectRef hiveObject, String userName, List<String> groupNames) throws  TException {
        return this.client.get_privilege_set(hiveObject, userName, groupNames);
    }

    @Override
    public List<HiveObjectPrivilege> list_privileges(String principalName, PrincipalType principalType, HiveObjectRef hiveObject) throws  TException {
        return this.client.list_privileges(principalName, principalType, hiveObject);
    }

    public String getDelegationToken(String renewerKerberosPrincipalName) throws  TException, IOException {
        String owner = this.conf.getUser();
        return this.getDelegationToken(owner, renewerKerberosPrincipalName);
    }

    @Override
    public String getDelegationToken(String owner, String renewerKerberosPrincipalName) throws  TException {
        return this.localMetaStore ? null : this.client.get_delegation_token(owner, renewerKerberosPrincipalName);
    }

    @Override
    public long renewDelegationToken(String tokenStrForm) throws  TException {
        return this.localMetaStore ? 0L : this.client.renew_delegation_token(tokenStrForm);
    }

    @Override
    public void cancelDelegationToken(String tokenStrForm) throws  TException {
        if (!this.localMetaStore) {
            this.client.cancel_delegation_token(tokenStrForm);
        }
    }

    @Override
    public boolean addToken(String tokenIdentifier, String delegationToken) throws TException {
        return this.client.add_token(tokenIdentifier, delegationToken);
    }

    @Override
    public boolean removeToken(String tokenIdentifier) throws TException {
        return this.client.remove_token(tokenIdentifier);
    }

    @Override
    public String getToken(String tokenIdentifier) throws TException {
        return this.client.get_token(tokenIdentifier);
    }

    @Override
    public List<String> getAllTokenIdentifiers() throws TException {
        return this.client.get_all_token_identifiers();
    }

    @Override
    public int addMasterKey(String key) throws  TException {
        return this.client.add_master_key(key);
    }

    @Override
    public void updateMasterKey(Integer seqNo, String key) throws  TException {
        this.client.update_master_key(seqNo, key);
    }

    @Override
    public boolean removeMasterKey(Integer keySeq) throws TException {
        return this.client.remove_master_key(keySeq);
    }

    @Override
    public String[] getMasterKeys() throws TException {
        List<String> keyList = this.client.get_master_keys();
        return (String[])keyList.toArray(new String[keyList.size()]);
    }

    @Override
    public ValidTxnList getValidTxns() throws TException {
        return TxnUtils.createValidReadTxnList(this.client.get_open_txns(), 0L);
    }

    @Override
    public ValidTxnList getValidTxns(long currentTxn) throws TException {
        return TxnUtils.createValidReadTxnList(this.client.get_open_txns(), currentTxn);
    }

    @Override
    public long openTxn(String user) throws TException {
        OpenTxnsResponse txns = this.openTxns(user, 1);
        return (Long)txns.getTxn_ids().get(0);
    }

    @Override
    public OpenTxnsResponse openTxns(String user, int numTxns) throws TException {

//        try {
////            String hostname = InetAddress.getLocalHost().getHostName();
//
//
//            return this.client.open_txns(new OpenTxnRequest(numTxns, user, hostname));
//        } catch (UnknownHostException var5) {
//            LOG.error("Unable to resolve my host name " + var5.getMessage());
//            throw new RuntimeException(var5);
//        }

        String hostname = InetAddress.getLoopbackAddress().getHostAddress();
        return this.client.open_txns(new OpenTxnRequest(numTxns, user, hostname));
    }

    @Override
    public void rollbackTxn(long txnid) throws  TException {
        this.client.abort_txn(new AbortTxnRequest(txnid));
    }

    @Override
    public void commitTxn(long txnid) throws   TException {
        this.client.commit_txn(new CommitTxnRequest(txnid));
    }

    @Override
    public GetOpenTxnsInfoResponse showTxns() throws TException {
        return this.client.get_open_txns_info();
    }

    @Override
    public void abortTxns(List<Long> txnids) throws  TException {
        this.client.abort_txns(new AbortTxnsRequest(txnids));
    }

    @Override
    public LockResponse lock(LockRequest request) throws   TException {
        return this.client.lock(request);
    }

    @Override
    public LockResponse checkLock(long lockid) throws    TException {
        return this.client.check_lock(new CheckLockRequest(lockid));
    }

    @Override
    public void unlock(long lockid) throws TException {
        this.client.unlock(new UnlockRequest(lockid));
    }

    /** @deprecated */
    @Override
    @Deprecated
    public ShowLocksResponse showLocks() throws TException {
        return this.client.show_locks(new ShowLocksRequest());
    }

    @Override
    public ShowLocksResponse showLocks(ShowLocksRequest request) throws TException {
        return this.client.show_locks(request);
    }

    @Override
    public void heartbeat(long txnid, long lockid) throws TException {
        HeartbeatRequest hb = new HeartbeatRequest();
        hb.setLockid(lockid);
        hb.setTxnid(txnid);
        this.client.heartbeat(hb);
    }

    @Override
    public HeartbeatTxnRangeResponse heartbeatTxnRange(long min, long max) throws TException {
        HeartbeatTxnRangeRequest rqst = new HeartbeatTxnRangeRequest(min, max);
        return this.client.heartbeat_txn_range(rqst);
    }

    /** @deprecated */
    @Override
    @Deprecated
    public void compact(String dbname, String tableName, String partitionName, CompactionType type) throws TException {
        CompactionRequest cr = new CompactionRequest();
        if (dbname == null) {
            cr.setDbname("default");
        } else {
            cr.setDbname(dbname);
        }

        cr.setTablename(tableName);
        if (partitionName != null) {
            cr.setPartitionname(partitionName);
        }

        cr.setType(type);
        this.client.compact(cr);
    }

    @Override
    public void compact(String dbname, String tableName, String partitionName, CompactionType type, Map<String, String> tblproperties) throws TException {
        CompactionRequest cr = new CompactionRequest();
        if (dbname == null) {
            cr.setDbname("default");
        } else {
            cr.setDbname(dbname);
        }

        cr.setTablename(tableName);
        if (partitionName != null) {
            cr.setPartitionname(partitionName);
        }

        cr.setType(type);
        cr.setProperties(tblproperties);
        this.client.compact(cr);
    }

    @Override
    public ShowCompactResponse showCompactions() throws TException {
        return this.client.show_compact(new ShowCompactRequest());
    }

    /** @deprecated */
    @Override
    @Deprecated
    public void addDynamicPartitions(long txnId, String dbName, String tableName, List<String> partNames) throws TException {
        this.client.add_dynamic_partitions(new AddDynamicPartitions(txnId, dbName, tableName, partNames));
    }

    @Override
    public void addDynamicPartitions(long txnId, String dbName, String tableName, List<String> partNames, DataOperationType operationType) throws TException {
        AddDynamicPartitions adp = new AddDynamicPartitions(txnId, dbName, tableName, partNames);
        adp.setOperationType(operationType);
        this.client.add_dynamic_partitions(adp);
    }

    @Override
    @InterfaceAudience.LimitedPrivate({"HCatalog"})
    public NotificationEventResponse getNextNotification(long lastEventId, int maxEvents, NotificationFilter filter) throws TException {
        NotificationEventRequest rqst = new NotificationEventRequest(lastEventId);
        rqst.setMaxEvents(maxEvents);
        NotificationEventResponse rsp = this.client.get_next_notification(rqst);
//        LOG.debug("Got back " + rsp.getEventsSize() + " events");
        if (filter == null) {
            return rsp;
        } else {
            NotificationEventResponse filtered = new NotificationEventResponse();
            if (rsp != null && rsp.getEvents() != null) {
                Iterator var8 = rsp.getEvents().iterator();

                while(var8.hasNext()) {
                    NotificationEvent e = (NotificationEvent)var8.next();
                    if (filter.accept(e)) {
                        filtered.addToEvents(e);
                    }
                }
            }

            return filtered;
        }
    }

    @Override
    @InterfaceAudience.LimitedPrivate({"HCatalog"})
    public CurrentNotificationEventId getCurrentNotificationEventId() throws TException {
        return this.client.get_current_notificationEventId();
    }

    @Override
    @InterfaceAudience.LimitedPrivate({"Apache Hive, HCatalog"})
    public FireEventResponse fireListenerEvent(FireEventRequest rqst) throws TException {
        return this.client.fire_listener_event(rqst);
    }

//    public static IMetaStoreClient newSynchronizedClient(IMetaStoreClient client) {
//        return (IMetaStoreClient) Proxy.newProxyInstance(HiveMetaStoreClient.class.getClassLoader(), new Class[]{IMetaStoreClient.class}, new HiveMetaStoreClient.SynchronizedHandler(client));
//    }

    @Override
    public void markPartitionForEvent(String db_name, String tbl_name, Map<String, String> partKVs, PartitionEventType eventType) throws  TException {
        assert db_name != null;

        assert tbl_name != null;

        assert partKVs != null;

        this.client.markPartitionForEvent(db_name, tbl_name, partKVs, eventType);
    }

    @Override
    public boolean isPartitionMarkedForEvent(String db_name, String tbl_name, Map<String, String> partKVs, PartitionEventType eventType) throws TException {
        assert db_name != null;

        assert tbl_name != null;

        assert partKVs != null;

        return this.client.isPartitionMarkedForEvent(db_name, tbl_name, partKVs, eventType);
    }

    @Override
    public void createFunction(Function func) throws  TException {
        this.client.create_function(func);
    }

    @Override
    public void alterFunction(String dbName, String funcName, Function newFunction) throws  TException {
        this.client.alter_function(dbName, funcName, newFunction);
    }

    @Override
    public void dropFunction(String dbName, String funcName) throws    TException {
        this.client.drop_function(dbName, funcName);
    }

    @Override
    public Function getFunction(String dbName, String funcName) throws  TException {
        Function f = this.client.get_function(dbName, funcName);
        return this.fastpath ? f : this.deepCopy(f);
    }

    @Override
    public List<String> getFunctions(String dbName, String pattern) throws  TException {
        return this.client.get_functions(dbName, pattern);
    }

    @Override
    public GetAllFunctionsResponse getAllFunctions() throws  TException {
        return this.client.get_all_functions();
    }

    protected void create_table_with_environment_context(Table tbl, EnvironmentContext envContext) throws TException {
        this.client.create_table_with_environment_context(tbl, envContext);
    }

    protected void drop_table_with_environment_context(String dbname, String name, boolean deleteData, EnvironmentContext envContext) throws  TException,  UnsupportedOperationException {
        this.client.drop_table_with_environment_context(dbname, name, deleteData, envContext);
    }

    @Override
    public AggrStats getAggrColStatsFor(String dbName, String tblName, List<String> colNames, List<String> partNames) throws   TException {
        if (!colNames.isEmpty() && !partNames.isEmpty()) {
            PartitionsStatsRequest req = new PartitionsStatsRequest(dbName, tblName, colNames, partNames);
            return this.client.get_aggr_stats_for(req);
        } else {
            LOG.debug("Columns is empty or partNames is empty : Short-circuiting stats eval on client side.");
            return new AggrStats(new ArrayList(), 0L);
        }
    }

    @Override
    public Iterable<Map.Entry<Long, ByteBuffer>> getFileMetadata(final List<Long> fileIds)   {
//        return new HiveMetaStoreClient.MetastoreMapIterable<Long, ByteBuffer>() {
//            private int listIndex = 0;
//
//            protected Map<Long, ByteBuffer> fetchNextBatch() throws TException {
//                if (this.listIndex == fileIds.size()) {
//                    return null;
//                } else {
//                    int endIndex = Math.min(this.listIndex + HiveMetaStoreClient.this.fileMetadataBatchSize, fileIds.size());
//                    List<Long> subList = fileIds.subList(this.listIndex, endIndex);
//                    GetFileMetadataResult resp = HiveMetaStoreClient.this.sendGetFileMetadataReq(subList);
//                    if (!resp.isIsSupported()) {
                        return null;
//                    } else {
//                        this.listIndex = endIndex;
//                        return resp.getMetadata();
//                    }
//                }
//            }
//        };
    }

    private GetFileMetadataResult sendGetFileMetadataReq(List<Long> fileIds) throws TException {
        return this.client.get_file_metadata(new GetFileMetadataRequest(fileIds));
    }

    @Override
    public Iterable<Map.Entry<Long, MetadataPpdResult>> getFileMetadataBySarg(final List<Long> fileIds, final ByteBuffer sarg, final boolean doGetFooters) throws TException {
//        return new HiveMetaStoreClient.MetastoreMapIterable<Long, MetadataPpdResult>() {
//            private int listIndex = 0;
//
//            protected Map<Long, MetadataPpdResult> fetchNextBatch() throws TException {
//                if (this.listIndex == fileIds.size()) {
//                    return null;
//                } else {
//                    int endIndex = Math.min(this.listIndex + HiveMetaStoreClient.this.fileMetadataBatchSize, fileIds.size());
//                    List<Long> subList = fileIds.subList(this.listIndex, endIndex);
//                    GetFileMetadataByExprResult resp = HiveMetaStoreClient.this.sendGetFileMetadataBySargReq(sarg, subList, doGetFooters);
//                    if (!resp.isIsSupported()) {
                        return null;
//                    } else {
//                        this.listIndex = endIndex;
//                        return resp.getMetadata();
//                    }
//                }
//            }
//        };
    }

    private GetFileMetadataByExprResult sendGetFileMetadataBySargReq(ByteBuffer sarg, List<Long> fileIds, boolean doGetFooters) throws TException {
        GetFileMetadataByExprRequest req = new GetFileMetadataByExprRequest(fileIds, sarg);
        req.setDoGetFooters(doGetFooters);
        return this.client.get_file_metadata_by_expr(req);
    }

    @Override
    public void clearFileMetadata(List<Long> fileIds) throws TException {
        ClearFileMetadataRequest req = new ClearFileMetadataRequest();
        req.setFileIds(fileIds);
        this.client.clear_file_metadata(req);
    }

    @Override
    public void putFileMetadata(List<Long> fileIds, List<ByteBuffer> metadata) throws TException {
        PutFileMetadataRequest req = new PutFileMetadataRequest();
        req.setFileIds(fileIds);
        req.setMetadata(metadata);
        this.client.put_file_metadata(req);
    }

    @Override
    public boolean isSameConfObj(HiveConf c) {
        return this.conf == c;
    }

    @Override
    public boolean cacheFileMetadata(String dbName, String tableName, String partName, boolean allParts) throws TException {
        CacheFileMetadataRequest req = new CacheFileMetadataRequest();
        req.setDbName(dbName);
        req.setTblName(tableName);
        if (partName != null) {
            req.setPartName(partName);
        } else {
            req.setIsAllParts(allParts);
        }

        CacheFileMetadataResult result = this.client.cache_file_metadata(req);
        return result.isIsSupported();
    }

    /**
     * public abstract static class MetastoreMapIterable<K, V> implements Iterable<Map.Entry<K, V>>, Iterator<Map.Entry<K, V>> {
     *         private Iterator<Map.Entry<K, V>> currentIter;
     *
     *         public MetastoreMapIterable() {
     *         }
     *
     *         protected abstract Map<K, V> fetchNextBatch() throws TException;
     *
     *         public Iterator<Map.Entry<K, V>> iterator() {
     *             return this;
     *         }
     *
     *         public boolean hasNext() {
     *             this.ensureCurrentBatch();
     *             return this.currentIter != null;
     *         }
     *
     *         private void ensureCurrentBatch() {
     *             if (this.currentIter == null || !this.currentIter.hasNext()) {
     *                 this.currentIter = null;
     *
     *                 Map currentBatch;
     *                 do {
     *                     try {
     *                         currentBatch = this.fetchNextBatch();
     *                     } catch (TException var3) {
     *                         throw new RuntimeException(var3);
     *                     }
     *
     *                     if (currentBatch == null) {
     *                         return;
     *                     }
     *                 } while(currentBatch.isEmpty());
     *
     *                 this.currentIter = currentBatch.entrySet().iterator();
     *             }
     *         }
     *
     *         public Map.Entry<K, V> next() {
     *             this.ensureCurrentBatch();
     *             if (this.currentIter == null) {
     *                 throw new NoSuchElementException();
     *             } else {
     *                 return (Map.Entry)this.currentIter.next();
     *             }
     *         }
     *
     *         public void remove() {
     *             throw new UnsupportedOperationException();
     *         }
     *     }
     */

    /**
     * private static class SynchronizedHandler implements InvocationHandler {
     *         private final IMetaStoreClient client;
     *
     *         SynchronizedHandler(IMetaStoreClient client) {
     *             this.client = client;
     *         }
     *
     *         public synchronized Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
     *             try {
     *                 return method.invoke(this.client, args);
     *             } catch (InvocationTargetException var5) {
     *                 throw var5.getTargetException();
     *             }
     *         }
     *     }
     */
}
