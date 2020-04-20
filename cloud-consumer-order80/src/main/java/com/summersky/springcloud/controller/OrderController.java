package com.summersky.springcloud.controller;

import com.summersky.entity.CommentResult;
import com.summersky.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-18
 * @Time:21:36
 * @Description:
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    /**
     * 调用服务的请求地址,单机版写死地址可以，但是集群不能，当有多个服务提供者的时候，只认服务名称，不然达不到负载均衡的效果
     * 同时你要开启restTemplate的负载均衡，不然服务器会不知道调用那一台服务器下提供的服务
     */
    public static final  String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/add")
    public CommentResult<Payment> add(@RequestBody Payment payment){
        log.info("调用8001服务新增数据接口");
        return restTemplate.postForObject(PAYMENT_URL+"/payment/add",payment,CommentResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommentResult<Payment> getPaymentById(@PathVariable("id") Long id){
        log.info("调用8001服务查询接口");
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommentResult.class);
    }
}
