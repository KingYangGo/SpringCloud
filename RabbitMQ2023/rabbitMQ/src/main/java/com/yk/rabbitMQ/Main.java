package com.yk.rabbitMQ;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Title: ${NAME}
 * @Author YangK
 * @Package com.yk
 * @Date ${DATE} ${TIME}
 * @description: ${description}
 */
public class Main {
    public static void main(String[] args) throws IOException, TimeoutException {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("10.130.192.128");
        factory.setUsername("admin");
        factory.setPassword("123456");
        try(Connection connection = factory.newConnection()){
            System.out.println(132);
        }
        System.out.println("Hello world!");
    }
}