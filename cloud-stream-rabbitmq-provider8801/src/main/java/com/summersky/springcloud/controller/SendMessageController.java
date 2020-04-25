package com.summersky.springcloud.controller;

import com.summersky.springcloud.service.ImessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-25
 * @Time:18:49
 * @Description:
 */
@RestController
public class SendMessageController {
    @Resource
    private ImessageProvider messageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
