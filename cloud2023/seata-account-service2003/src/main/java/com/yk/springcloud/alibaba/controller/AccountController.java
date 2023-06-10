package com.yk.springcloud.alibaba.controller;/**
 * @Title: StorageController
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.controller
 * @Date 2023/6/10 18:41
 * @description:
 */

import com.yk.springcloud.alibaba.domain.CommonResult;
import com.yk.springcloud.alibaba.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author YangCoder
 * @version 2023/6/10 18:41
 * @since JDK8
 */
@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    /**
     * 扣减账户余额
     */
    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功！");
    }
}

