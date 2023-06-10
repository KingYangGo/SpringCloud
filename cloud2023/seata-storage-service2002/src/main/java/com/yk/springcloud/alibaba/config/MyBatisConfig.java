package com.yk.springcloud.alibaba.config;/**
 * @Title: MyBatisConfig
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.config
 * @Date 2023/6/10 17:53
 * @description:
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author YangCoder
 * @version 2023/6/10 17:53
 * @since JDK8
 */
@Configuration
@MapperScan({"com.yk.springcloud.alibaba.dao"})
public class MyBatisConfig {
}



