package com.yk.springcloud.service;/**
 * @Title: ReceiveMessageListener
 * @Author YangK
 * @Package com.yk.springcloud.service
 * @Date 2023/5/25 17:20
 * @description:
 */

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
/**
 *
 * @author YangCoder
 * @version 2023/5/25 17:20
 * @since JDK8
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListener
{
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message)
    {
        System.out.println("消费者1号，------->接收到的消息：" + message.getPayload()+"\t port: "+serverPort);
    }
}



