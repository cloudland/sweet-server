package com.zeinex.sweet.server.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 所有控制器需要集成的基础控制类
 *
 * @author 未小雨
 * @date 2023/7/25 16:32
 */
public class AbstractParentControl {

    /**
     * 日志对象
     */
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /**
     * 默认每页显示记录数
     */
    private final Integer DEFAULT_PAGESIZE = 9;

    /**
     * 获取日志对象
     *
     * @return
     */
    protected Logger getLogger() {
        return LOGGER;
    }

    /**
     * 默认分页大小
     *
     * @return
     */
    protected Integer getPageSize() {
        return DEFAULT_PAGESIZE;
    }

}
