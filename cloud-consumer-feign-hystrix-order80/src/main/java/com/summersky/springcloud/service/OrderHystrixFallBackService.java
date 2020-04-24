package com.summersky.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-24
 * @Time:10:55
 * @Description:
 */
@Component
public class OrderHystrixFallBackService implements OrderHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_TimeOut,o(╥﹏╥)o";
    }
}
