package com.jb;

import com.jb.hive.HiveMetaStoreCollect;
import org.apache.thrift.TException;

public class HiveExecDemo {
    public static void main(String[] args) throws TException {
        String hiveMetastoreUris = "thrift://cmserver-dev.csii.cn:9083";
        HiveMetaStoreCollect collect =
                HiveMetaStoreCollect.createHiveMetastoreConnect(hiveMetastoreUris);

        System.out.println(collect.getAllDatabases());
        System.out.println(collect.getDatabase("flink_quality"));
    }
}
