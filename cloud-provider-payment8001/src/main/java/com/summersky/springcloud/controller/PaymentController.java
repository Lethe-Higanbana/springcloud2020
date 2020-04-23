package com.summersky.springcloud.controller;

import com.summersky.springcloud.entity.CommentResult;
import com.summersky.springcloud.entity.Payment;
import com.summersky.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 支付表 前端控制器
 * </p>
 *
 * @author zengfanbin
 * @since 2020-04-18
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    /**
     * 获取服务信息，类似网站的关于我们
     */
    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/add")
    public CommentResult add(Payment payment){
        int result = paymentService.add(payment);
        log.info("***插入结果***:"+result);
        if (result > 0){
            return new CommentResult(200,"插入数据成功,serverPort:"+serverPort,result);
        }else {
            return  new CommentResult(500,"数据插入失败",null);
        }
    }

    @GetMapping("/get/{id}")
    public CommentResult getPaymentById(@PathVariable("id") Long id){
        log.info("***进入方法***");
        Payment payment = paymentService.getPaymentById(id);
        log.info("***查询结果***："+payment);
        if (payment !=null){
            return new CommentResult(200,"数据查询成功,serverPort:"+serverPort,payment);
        }else {
            return new CommentResult(500,"数据查询失败",payment);
        }
    }

    /**
     * 服务发现
     *
     * @return
     */
    @GetMapping(value = "/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("*****element:" + element);
        }
        // 一个微服务下的全部实例
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.debug(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + instance.getUri());
        }
        return this.discoveryClient;
    }

    /**
     * 模拟线程故障3秒
     * @return
     */
    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}

