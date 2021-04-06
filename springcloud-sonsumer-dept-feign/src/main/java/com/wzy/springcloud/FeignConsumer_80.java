package com.wzy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
//开启包扫描
@EnableFeignClients(basePackages = {"com.wzy.springcloud"})
public class FeignConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumer_80.class,args);
    }
}
