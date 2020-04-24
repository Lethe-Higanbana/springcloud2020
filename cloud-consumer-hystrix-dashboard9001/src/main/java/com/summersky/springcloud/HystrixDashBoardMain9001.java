package com.summersky.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-24
 * @Time:18:02
 * @Description:
 * @EnableHystrixDashboard:开启仪表盘
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoardMain9001.class,args);
    }
}
