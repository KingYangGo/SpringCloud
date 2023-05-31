package com.yk.springcloud.controller;/**
 * @Title: ConfigClientController
 * @Author YangK
 * @Package com.yk.springcloud.controller
 * @Date 2023/5/18 14:37
 * @description:
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author YangCoder
 * @version 2023/5/18 14:37
 * @since JDK8
 */
@RestController
@RefreshScope
public class ConfigClientController
{
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo()
    {
        return configInfo;
    }
}




