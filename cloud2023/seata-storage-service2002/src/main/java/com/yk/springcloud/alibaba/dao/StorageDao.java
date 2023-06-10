package com.yk.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Title: StorageDao
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.dao
 * @Date 2023/6/10 18:37
 * @description:
 */
@Mapper
public interface StorageDao {

    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
