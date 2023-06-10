package com.yk.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Title: StorageService
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.service
 * @Date 2023/6/10 18:37
 * @description:
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}

