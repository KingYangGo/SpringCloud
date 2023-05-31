package com.yk.rabbitMQ.three;/**
 * @Title: Task02
 * @Author YangK
 * @Package com.yk.rabbitMQ.three
 * @Date 2023/5/25 14:51
 * @description:
 */

import com.rabbitmq.client.Channel;
import com.yk.rabbitMQ.utils.RabbitMqUtils;

import java.util.Scanner;

/**
 *
 * @author YangCoder
 * @version 2023/5/25 14:51
 * @since JDK8
 */
public class Task02 {
    private static final String TASK_QUEUE_NAME = "ack_queue";
    public static void main(String[] argv) throws Exception {
        try (Channel channel = RabbitMqUtils.getChannel()) {
            channel.queueDeclare(TASK_QUEUE_NAME, false, false, false, null);
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入信息");
            while (sc.hasNext()) {
                String message = sc.nextLine();
                channel.basicPublish("", TASK_QUEUE_NAME, null, message.getBytes("UTF-8"));
                System.out.println("生产者发出消息" + message);
            }
        }
    }
}
