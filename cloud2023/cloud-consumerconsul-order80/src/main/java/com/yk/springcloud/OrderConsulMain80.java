package com.yk.springcloud;/**
 * @Title: PaymentMain8006
 * @Author YangK
 * @Package com.yk.springcloud
 * @Date 2023/5/9 15:11
 * @description:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @author YangCoder
 * @version 2023/5/9 15:11
 * @since JDK8
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderConsulMain80.class,args);
    }
}

