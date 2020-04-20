package com.summersky.springcloud.service;

import com.summersky.springcloud.entity.Payment;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 支付表 服务类
 * </p>
 *
 * @author zengfanbin
 * @since 2020-04-18
 */
public interface PaymentService extends IService<Payment> {
    /**
     * 插入数据
     * @param payment
     * @return
     */
    int add(Payment payment);

    /**
     * 根据ID查询数据
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);

}
