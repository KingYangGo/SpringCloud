package com.yk.springcloud.controller;/**
 * @Title: PaymentController
 * @Author YangK
 * @Package com.yk.springcloud.controller
 * @Date 2023/5/9 14:55
 * @description:
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 *
 * @author YangCoder
 * @version 2023/5/9 14:55
 * @since JDK8
 */
@RestController
public class PaymentController
{
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String paymentInfo()
    {
        return "springcloud with consul: "+serverPort+"\t\t"+ UUID.randomUUID().toString();
    }
}

