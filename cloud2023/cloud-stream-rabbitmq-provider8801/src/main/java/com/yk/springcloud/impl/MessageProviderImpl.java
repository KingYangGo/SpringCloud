package com.yk.springcloud.impl;
/**
 * @Title: MessageProviderImpl
 * @Author YangK
 * @Package com.yk.springcloud.impl
 * @Date 2023/5/25 15:37
 * @description:
 */

import com.yk.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import javax.annotation.Resource;
import java.util.UUID;

/**
 *
 * @author YangCoder
 * @version 2023/5/25 15:37
 * @since JDK8
 */
@EnableBinding(Source.class) // 可以理解为是一个消息的发送管道的定义
public class MessageProviderImpl implements IMessageProvider
{
    @Resource
    private MessageChannel output; // 消息的发送管道

    @Override
    public String send()
    {
        String serial = UUID.randomUUID().toString();
        this.output.send(MessageBuilder.withPayload(serial).build()); // 创建并发送消息
        System.out.println("***serial: "+serial);

        return serial;
    }
}



