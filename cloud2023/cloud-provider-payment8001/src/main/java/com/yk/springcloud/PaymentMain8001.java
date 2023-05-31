package com.yk.springcloud;/**
 * @Title: PaymentMain8001
 * @Author YangK
 * @Package com.yk.springcloud
 * @Date 2023/5/4 18:47
 * @description:
 */

/**
 *
 * @author YangCoder
 * @version 2023/5/4 18:47
 * @since JDK8
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @auther zzyy
 * @create 2020-01-27 19:50
 */

@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}


