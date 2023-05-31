package com.yk.springcloud.config;/**
 * @Title: ApplicationContextConfig
 * @Author YangK
 * @Package com.yk.springcloud.config
 * @Date 2023/5/5 11:25
 * @description:
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author YangCoder
 * @version 2023/5/5 11:25
 * @since JDK8
 */
@Configuration
public class ApplicationContextConfig
{
  //   @LoadBalanced
    @Bean
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}


