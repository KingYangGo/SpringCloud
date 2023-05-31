package com.yk.springcloud.alibaba.config;/**
 * @Title: ApplicationContextBean
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.config
 * @Date 2023/5/26 11:37
 * @description:
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author YangCoder
 * @version 2023/5/26 11:37
 * @since JDK8
 */
@Configuration
public class ApplicationContextBean
{
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}



