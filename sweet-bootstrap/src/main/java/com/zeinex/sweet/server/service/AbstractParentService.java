package com.zeinex.sweet.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 服务层公共基础服务类
 *
 * @author 未小雨
 * @date 2023/7/25 16:34
 */
public class AbstractParentService {

    /**
     * 日志对象
     */
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /**
     * 获取日志对象
     *
     * @return
     */
    protected Logger getLogger() {
        return LOGGER;
    }

}
