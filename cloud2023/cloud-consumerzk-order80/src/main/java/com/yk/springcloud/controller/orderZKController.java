package com.yk.springcloud.controller;/**
 * @Title: orderZKController
 * @Author YangK
 * @Package com.yk.springcloud.controller
 * @Date 2023/5/7 21:12
 * @description:
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 *
 * @author YangCoder
 * @version 2023/5/7 21:12
 * @since JDK8
 */
@Slf4j
@RestController
public class orderZKController {
    public static final String INVOKE_URL = "http://cloud-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        System.out.println("消费者调用支付服务（zookeeper）: "+result);
        return  result;
    }
}

