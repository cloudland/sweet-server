package com.zeinex.sweet.schema.support.store.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zeinex.sweet.schema.support.store.data.entity.DataSchemaEntity;
import org.springframework.stereotype.Repository;

/**
 * 数据结构数据库操作
 *
 * @author 未小雨
 * @date 2023/7/25 21:45
 */
@Repository("Sweet.Schema.Store.Data.DataSchemaMapper")
public interface DataSchemaMapper extends BaseMapper<DataSchemaEntity> {
}