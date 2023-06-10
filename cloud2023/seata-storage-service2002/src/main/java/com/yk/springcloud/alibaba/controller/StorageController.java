package com.yk.springcloud.alibaba.controller;/**
 * @Title: StorageController
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.controller
 * @Date 2023/6/10 18:41
 * @description:
 */

import com.yk.springcloud.alibaba.domain.CommonResult;
import com.yk.springcloud.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author YangCoder
 * @version 2023/6/10 18:41
 * @since JDK8
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
