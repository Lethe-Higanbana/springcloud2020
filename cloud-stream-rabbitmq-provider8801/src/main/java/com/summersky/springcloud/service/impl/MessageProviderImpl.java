package com.summersky.springcloud.service.impl;

import com.summersky.springcloud.service.ImessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-25
 * @Time:18:37
 * @Description:
 * EnableBinding 定义消息的推送管道
 * Source.class：代表消息发送，生产者
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements ImessageProvider {

    /**
     * 消息发送管道
     */
    @Resource
    private MessageChannel output;

    /**
     * MessageBuilder.withPayload(serial).build()：构造消息发送方法
     * output：发送
     * input：接收
     * @return
     */
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("serial = " + serial);
        return serial;
    }
}
