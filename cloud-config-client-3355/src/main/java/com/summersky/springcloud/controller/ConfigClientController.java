package com.summersky.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-25
 * @Time:11:54
 * @Description:
 * @RefreshScope:开启刷新功能，改完需要post请求localhost:3355/actuator/refresh才能生效
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
