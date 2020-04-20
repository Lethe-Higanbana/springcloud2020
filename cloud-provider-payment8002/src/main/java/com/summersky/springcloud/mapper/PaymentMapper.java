package com.summersky.springcloud.mapper;

import com.summersky.springcloud.entity.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 支付表 Mapper 接口
 * </p>
 *
 * @author zengfanbin
 * @since 2020-04-18
 */
public interface PaymentMapper extends BaseMapper<Payment> {
    /**
     * 插入一条数据
     * @param payment
     * @return
     */
    int add(Payment payment);

    /**
     * 根据ID获取数据
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
