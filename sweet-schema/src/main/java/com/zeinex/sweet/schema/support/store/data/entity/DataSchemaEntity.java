package com.zeinex.sweet.schema.support.store.data.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zeinex.sweet.schema.support.store.AbstractBasicEntity;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * 数据结构数据库实体
 *
 * @author 未小雨
 * @date 2023/7/25 21:15
 */
@TableName(value = "SWEET_DATA_SCHEMA", schema = "mew_chain")
@Alias("Sweet.Schema.Store.DataSchemaEntity")
@Data
public class DataSchemaEntity extends AbstractBasicEntity {

    /**
     * 主键标识
     */
    @TableId("IDENTIFIER_NO")
    private Long identifierNo;

    /**
     * 结构类型
     */
    @TableField("SCHEMA_TYPE")
    private String schemaType;

    /**
     * 结构索引
     */
    @TableField("SCHEMA_INDEX")
    private Integer schemaIndex;

    /**
     * 数据类型
     */
    @TableField("DATA_TYPE")
    private String dataType;

    /**
     * 数据字段
     */
    @TableField("DATA_FIELD")
    private String dataField;

}
