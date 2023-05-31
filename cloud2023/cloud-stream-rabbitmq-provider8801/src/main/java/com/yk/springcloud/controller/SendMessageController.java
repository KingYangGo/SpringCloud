package com.yk.springcloud.controller;/**
 * @Title: SendMessageController
 * @Author YangK
 * @Package com.yk.springcloud.controller
 * @Date 2023/5/25 15:42
 * @description:
 */

import com.yk.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * @author YangCoder
 * @version 2023/5/25 15:42
 * @since JDK8
 */
@RestController
public class SendMessageController
{
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return messageProvider.send();
    }
}




