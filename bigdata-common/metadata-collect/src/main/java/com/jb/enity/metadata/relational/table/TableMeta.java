package com.jb.enity.metadata.relational.table;

import com.jb.enity.metadata.relational.column.TableColumnMeta;
import lombok.Data;

import java.util.List;


/**
 * @author zhaojb
 * 表信息
 */

@Data
public class TableMeta {

    /**
     * 表名
     */
    protected String tableName;

    /**
     * 表注释
     */
    protected String tableComment;

    /**
     * 表字段数
     */
    protected Integer tableFieldNum;

    /**
     * 表容量大小
     */
    protected Double tableCapacity;

    /**
     * 建表语句
     */
    protected String createTableInfo;

    /**
     * 字段
     */
    protected List<TableColumnMeta> columns;
}
