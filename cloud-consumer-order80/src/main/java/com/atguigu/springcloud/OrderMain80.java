package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

//再远程调用指定微服务时，会使用我们设置的负载均衡策略。
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE" ,configuration = MySelfRule.class)
@EnableEurekaClient//声明一个客户端
@SpringBootApplication
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}