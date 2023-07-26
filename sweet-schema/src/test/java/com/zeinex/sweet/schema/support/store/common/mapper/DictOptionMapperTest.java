package com.zeinex.sweet.schema.support.store.common.mapper;

import com.zeinex.sweet.schema.JUnitParentTest;
import com.zeinex.sweet.schema.support.store.common.entity.DictOptionEntity;
import jakarta.annotation.Resource;
import org.junit.Test;

import java.util.List;

/**
 * @author 未小雨
 * @date 2023/7/25 17:12
 */
public class DictOptionMapperTest extends JUnitParentTest {

    @Resource
    private DictOptionMapper mapper;

    @Test
    public void testFind() {

        List<DictOptionEntity> list = mapper.selectList(null);
        list.forEach(_loopEntity -> getLogger().info(String.valueOf(_loopEntity)));

    }

}