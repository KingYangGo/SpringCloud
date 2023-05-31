package com.yk.springcloud;/**
 * @Title: OrderFeignMain80
 * @Author YangK
 * @Package com.yk.springcloud
 * @Date 2023/5/10 19:57
 * @description:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *
 * @author YangCoder
 * @version 2023/5/10 19:57
 * @since JDK8
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}



