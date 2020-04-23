package com.summersky.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-23
 * @Time:9:49
 * @Description:自定义负载均衡规则，该类不能和主启动类处于同一包及其子包下
 */
public class MySelfRule {
    @Bean
    public IRule myRule(){
        // 定义为随机
        return new RandomRule();
    }
}
