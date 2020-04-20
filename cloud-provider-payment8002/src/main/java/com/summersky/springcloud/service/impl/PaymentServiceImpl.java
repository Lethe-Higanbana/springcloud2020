package com.summersky.springcloud.service.impl;

import com.summersky.springcloud.entity.Payment;
import com.summersky.springcloud.mapper.PaymentMapper;
import com.summersky.springcloud.service.PaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 支付表 服务实现类
 * </p>
 *
 * @author zengfanbin
 * @since 2020-04-18
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int add(Payment payment) {
        return paymentMapper.add(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
