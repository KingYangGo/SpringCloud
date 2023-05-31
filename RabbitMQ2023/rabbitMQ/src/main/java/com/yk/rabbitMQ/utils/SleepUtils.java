package com.yk.rabbitMQ.utils;/**
 * @Title: SleepUtils
 * @Author YangK
 * @Package com.yk.rabbitMQ.utils
 * @Date 2023/5/25 14:56
 * @description:
 */

/**
 *
 * @author YangCoder
 * @version 2023/5/25 14:56
 * @since JDK8
 */
public class SleepUtils {
    public static void sleep(int second){
        try {
            Thread.sleep(1000*second);
        } catch (InterruptedException _ignored) {
            Thread.currentThread().interrupt();
        }
    }
}