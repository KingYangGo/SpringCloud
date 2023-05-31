package com.yk.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Title: LoadBalancer
 * @Author YangK
 * @Package com.yk.lb
 * @Date 2023/5/9 18:20
 * @description:
 */
public interface LoadBalancer
{
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
