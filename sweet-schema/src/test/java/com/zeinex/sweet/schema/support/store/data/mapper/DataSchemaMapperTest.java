package com.zeinex.sweet.schema.support.store.data.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

//        newEntity.setCreatedTime(new Date());
//        newEntity.setUpdatedTime(new Date());
//        newEntity.setEndTime(new Date());
//        newEntity.setSeqNo(1L);

        mapper.insert(newEntity);


    }

    @Test
    public void testUpdate() {

//        DataSchemaEntity dbEntity = new DataSchemaEntity();
        DataSchemaEntity dbEntity = mapper.selectById(1684043097731878913L);

        getLogger().info(dbEntity.toString());
        dbEntity.setSchemaType("描述new");
        dbEntity.setSchemaIndex(1);
        dbEntity.setDataType("对象new");
        dbEntity.setDataField("字段名称new");

        // 逻辑删除
//        dbEntity.makeLogicDelete();

        mapper.updateById(dbEntity);

    }

    @Test
    public void testFind() {

//        DataSchemaEntity dbEntity = mapper.selectById(1684045796338626561L);

        LambdaQueryWrapper<DataSchemaEntity> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper
                // 标识等于
                .eq(DataSchemaEntity::getIdentifierNo, 1684055972399554561L)
                // 结束时间大于
                .gt(DataSchemaEntity::getEndTime, new Date());
        DataSchemaEntity dbEntity = mapper.selectOne(queryWrapper);

        getLogger().info(dbEntity.toString());

        mapper.updateById(dbEntity);

    }

    @Test
    public void testFindPage() {

        // 设置分页
        Page<DataSchemaEntity> pageCond = new Page<>(1, 9);

        // 设置查询条件
        LambdaQueryWrapper<DataSchemaEntity> queryCond = new LambdaQueryWrapper<>();
        queryCond
                // 结束时间大于
                .gt(DataSchemaEntity::getEndTime, new Date());
        Page<DataSchemaEntity> resultPage = mapper.selectPage(pageCond, queryCond);

        resultPage.getRecords().forEach(System.out::println);

    }

}