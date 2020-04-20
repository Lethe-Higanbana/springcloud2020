package com.summersky.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Lenovo
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-19
 * @Time:11:11
 * @Description:Eureka注册中心服务端
 */
@SpringBootApplication
/**
 * 声明当前类是eureka注册中心服务端
 */
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
