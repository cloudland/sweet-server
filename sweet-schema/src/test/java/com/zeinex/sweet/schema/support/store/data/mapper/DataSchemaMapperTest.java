package com.zeinex.sweet.schema.support.store.data.mapper;

import com.zeinex.sweet.schema.JUnitParentTest;
import com.zeinex.sweet.schema.support.store.data.entity.DataSchemaEntity;
import jakarta.annotation.Resource;
import org.junit.Test;

import java.util.Date;

/**
 * @author 未小雨
 * @date 2023/7/25 21:48
 */
public class DataSchemaMapperTest extends JUnitParentTest {

    @Resource
    private DataSchemaMapper mapper;

    @Test
    public void testInsert() {

        DataSchemaEntity newEntity = new DataSchemaEntity();
        newEntity.setSchemaType("描述");
        newEntity.setSchemaIndex(1);
        newEntity.setDataType("对象");
        newEntity.setDataField("字段名称");

        newEntity.setCreatedTime(new Date());
        newEntity.setUpdatedTime(new Date());
        newEntity.setEndTime(new Date());
        newEntity.setSeqNo(1);

        mapper.insert(newEntity);


    }

}