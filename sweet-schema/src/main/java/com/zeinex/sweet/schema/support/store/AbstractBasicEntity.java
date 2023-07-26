package com.zeinex.sweet.schema.support.store;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.util.Calendar;
import java.util.Date;

/**
 * 抽象的基础数据库实体类
 *
 * @author 未小雨
 * @date 2023/7/25 21:37
 */
@Data
public class AbstractBasicEntity {

    /**
     * 创建时间
     */
    @TableField("CREATED_TIME")
    private Date createdTime;

    /**
     * 更新时间
     */
    @TableField("UPDATED_TIME")
    private Date updatedTime;

    /**
     * 失效时间
     */
    @TableField("END_TIME")
    private Date endTime;

    /**
     * 序列号
     */
    @TableField("SEQ_NO")
    @Version
    private Long seqNo;

    {
        // 设置创建时间
        this.createdTime = new Date();
        // 设置更新时间
        this.updatedTime = new Date();

        // 设置失效时间
        Calendar calendar = Calendar.getInstance();
        calendar.set(9999, 11, 31, 23, 59, 59);
        this.endTime = calendar.getTime();

        this.seqNo = 1L;
    }

    public void setUpdatedTime(Date updatedTime) {
    }

    /**
     * 标记删除
     */
    public void makeLogicDelete() {
        this.endTime = this.updatedTime;
    }

}
