package com.yk.springcloud.controller;/**
 * @Title: ConfigClientController
 * @Author YangK
 * @Package com.yk.springcloud.controller
 * @Date 2023/5/26 14:16
 * @description:
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author YangCoder
 * @version 2023/5/26 14:16
 * @since JDK8
 */
@RestController
@RefreshScope //在控制器类加入@RefreshScope注解使当前类下的配置支持Nacos的动态刷新功能。
public class ConfigClientController
{
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}


