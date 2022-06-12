package com.jb;

import com.jb.env.FlinkTableEnv;
import com.jb.hive.HiveTable;
import org.apache.flink.table.api.TableEnvironment;
import org.apache.flink.table.catalog.hive.HiveCatalog;


public class FlinkTableHiveDemo {

    public static void main(String[] args) {

        TableEnvironment env = FlinkTableEnv.createFlinkTableEnv();

        HiveCatalog hive = HiveTable.createHiveCatalog("myHive", "flink_quality","D:/work/hive-setting");

        HiveTable hiveTable = HiveTable.builderFlinkTableEnv(env);

        hiveTable.registerCatalog("myHive",hive);
        hiveTable.useCatalog("myHive");
        hiveTable.executeSql("show tables").print();
        hiveTable.select();

    }
}
