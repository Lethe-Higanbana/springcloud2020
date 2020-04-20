package com.summersky.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-20
 * @Time:22:25
 * @Description:
 */
@RestController
@Slf4j
public class PaymentConsulController {
    @Value("${server.port}")
    private String serverPort;

    /**
     * http://localhost:8006/payment/zk
     *
     * @return
     */
    @RequestMapping(value = "payment/consul")
    public String paymentZk() {
        return "SpringCloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
