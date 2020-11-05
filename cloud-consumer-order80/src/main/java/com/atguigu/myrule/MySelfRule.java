package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//我们自己定义的规则配置类，不能放在ComponentScan包扫描下
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();//手动改变轮询方法为随机
    }

}
