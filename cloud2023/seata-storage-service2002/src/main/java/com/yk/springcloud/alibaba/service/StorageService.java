package com.yk.springcloud.alibaba.service;

/**
 * @Title: StorageService
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.service
 * @Date 2023/6/10 18:37
 * @description:
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}


