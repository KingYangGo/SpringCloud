package com.yk.springcloud.controller;/**
 * @Title: PaymentController
 * @Author YangK
 * @Package com.yk.springcloud.controller
 * @Date 2023/5/26 10:58
 * @description:
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author YangCoder
 * @version 2023/5/26 10:58
 * @since JDK8
 */
@RestController
public class PaymentController
{
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id)
    {
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
    }
}