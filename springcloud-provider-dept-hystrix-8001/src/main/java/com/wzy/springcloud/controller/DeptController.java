package com.wzy.springcloud.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wzy.springcloud.pojo.Dept;
import com.wzy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {


    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{deptno}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("deptno") Long deptno){
        Dept dept = deptService.queryById(deptno);
        if(dept == null){
            throw new RuntimeException();
        }
        return dept;
    }


    @GetMapping("/dept/list")
    public List<Dept> query(){
        return deptService.queryAll();
    }

    public Dept hystrixGet(@PathVariable Long id){
        return new Dept()
                .setDeptno(id)
                .setDname("id->"+id+ "没有对应的信息 @Hystrix")
                .setDb_source("no database in Mysql");
    }

}
