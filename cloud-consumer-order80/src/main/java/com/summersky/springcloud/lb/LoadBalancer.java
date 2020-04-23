package com.summersky.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-23
 * @Time:10:33
 * @Description:手写负载均衡算法接口
 */
public interface LoadBalancer {
    /**
     * 获取存活的服务实例列表（集群总数）
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
