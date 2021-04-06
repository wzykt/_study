package com.wzy.springcloud.controller;


import com.wzy.springcloud.pojo.Dept;
import com.wzy.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService service;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return this.service.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return this.service.queryById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> add(){
        return this.service.queryAll();
    }
}
