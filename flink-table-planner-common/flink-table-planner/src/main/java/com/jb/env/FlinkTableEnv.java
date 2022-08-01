package com.jb.env;

import org.apache.flink.table.api.EnvironmentSettings;
import org.apache.flink.table.api.TableEnvironment;

/**
 * @author zhaojb
 * 创建FlinkTable环境
 */
public class FlinkTableEnv {
    private FlinkTableEnv() {
    }

    /**
     * 创建FlinkTable执行环境
     */
    public static TableEnvironment createFlinkTableEnv() {
        EnvironmentSettings settings = EnvironmentSettings
                .newInstance()
                .inStreamingMode()
                .build();

        return TableEnvironment.create(settings);
    }
}
