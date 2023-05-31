package com.example.demo.controller;

/**
 * test
 *
 * @author YangCoder
 * @version 2023/2/24 19:13
 * @since JDK8
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
     * @auther zzyy
     * @create 2021-10-25 17:43
     */
@RestController
public class OrderController
{
                @Value("${server.port}")
                private String port;
                @RequestMapping("/order/docker")
                public String helloDocker()
             {
                 return "hello docker"+"\t"+port+"\t"+ UUID.randomUUID().toString();
             }

                @RequestMapping(value ="/order/index",method = RequestMethod.GET)
                public String index()
             {

                 return "服务端口号: "+"\t"+port+"\t"+UUID.randomUUID().toString();
             }
}
