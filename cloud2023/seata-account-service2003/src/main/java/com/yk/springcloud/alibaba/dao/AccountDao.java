package com.yk.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Title: StorageDao
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.dao
 * @Date 2023/6/10 18:37
 * @description:
 */
@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}

