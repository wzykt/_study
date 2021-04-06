package com.wzy.springcloud.controller;

import com.wzy.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
public class DeptConsumerController {
    //消费者，不应该由service层

    //RestTemplate
    //RestTemplate是Spring提供的用于访问Rest服务的客户端，RestTemplate提供了多种便捷访问远程Http服务的方法,能够大大提高客户端的编写效率。
    @Autowired
    private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIX = "http://localhost:8001/";

    //Ribbon，通过服务名来访问，服务名spring.application.name=[springcloud-provider-dept]大写
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/list")
    public List<Dept> get(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }


}
