package com.yk.springcloud.config;/**
 * @Title: FeignConfig
 * @Author YangK
 * @Package com.yk.springcloud.config
 * @Date 2023/5/10 20:43
 * @description:
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.Logger;
/**
 *
 * @author YangCoder
 * @version 2023/5/10 20:43
 * @since JDK8
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }

}

