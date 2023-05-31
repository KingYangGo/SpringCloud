package com.yk.myRule;/**
 * @Title: MySelfRule
 * @Author YangK
 * @Package com.yk.myRule
 * @Date 2023/5/9 16:31
 * @description:
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author YangCoder
 * @version 2023/5/9 16:31
 * @since JDK8
 */
public class MySelfRule {
    @Bean
    public IRule myRule()
    {
        return new RandomRule();//定义为随机选择服务
    }

}

