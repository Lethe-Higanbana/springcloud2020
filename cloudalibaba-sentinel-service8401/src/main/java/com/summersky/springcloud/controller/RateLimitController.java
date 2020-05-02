package com.summersky.springcloud.controller;

import cn.hutool.core.util.IdUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.summersky.entity.CommentResult;
import com.summersky.entity.Payment;
import com.summersky.springcloud.myhandler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-30
 * @Time:11:15
 * @Description:
 */
@RestController
public class RateLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommentResult byResource(){
        return new CommentResult(200, "按资源名称限流测试OK", new Payment(2020L, IdUtil.simpleUUID()));
    }

    public CommentResult handleException(BlockException blockException){
        return new CommentResult<>(444, blockException.getClass().getCanonicalName()+"\t服务不可用" );
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommentResult byUrl(){
        return new CommentResult(200, "by url限流测试OK", new Payment(2020L, IdUtil.simpleUUID()));
    }
    //CustomerBlockHandler

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException2")
    public CommentResult customerBlockHandler(){
        return new CommentResult(200, "客户自定义 限流测试OK", new Payment(2020L, IdUtil.simpleUUID()));
    }
}
