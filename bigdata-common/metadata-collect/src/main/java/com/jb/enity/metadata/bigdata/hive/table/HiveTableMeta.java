package com.jb.enity.metadata.bigdata.hive.table;

import com.jb.enity.metadata.bigdata.hive.column.HiveTableColumnMeta;
import lombok.Data;
import org.apache.hadoop.hive.metastore.api.FieldSchema;

import java.util.List;

@Data
public class HiveTableMeta {

    /**
     * 表名
     */
    private String tableName;

    /**
     * 表类型
     * 内部表,外部表
     */
    private String tableType;

    /**
     * 表注释
     */
    private String tableComment;

    /**
     * 表路径
     */
    private String tableLocation;


    private String rowFormatSerde;
    private String storedToInputFormat;
    private String storedToOutputFormat;

    /**
     * 表字段数
     */
    private Integer tableFieldNum;

    /**
     * 分区字段数
     */
    private Integer partitionKeysSum;

    /**
     * 分桶字段数
     */
    private Integer bucketFieldNum;

    /**
     * 表容量大小
     */
    private Double tableCapacity;

    /**
     * 建表语句
     */
    private String createTableInfo;

    /**
     * 表字段
     */
    private List<HiveTableColumnMeta> columns;

    /**
     * 分桶字段
     */
    private  List<String> bucketColumns;

    /**
     * 分区字段
     */
    private List<FieldSchema> partitionColumns;

}
