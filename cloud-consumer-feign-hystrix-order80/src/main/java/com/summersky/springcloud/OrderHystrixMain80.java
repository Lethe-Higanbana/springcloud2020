package com.summersky.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-23
 * @Time:22:49
 * @Description:
 * @EnableHystrix注解与@EnableCircuitBreaker注解的区别:两者作用是一样的，都是开启Hystrix服务降级、熔断、限流，@EnableHystrix对@EnableCircuitBreaker进行了封装
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}
