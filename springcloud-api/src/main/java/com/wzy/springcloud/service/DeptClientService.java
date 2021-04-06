package com.wzy.springcloud.service;

import com.wzy.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

//项目使用了Ribbon，value属性会作为微服务的名称，用于服务发现
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @GetMapping("dept/get/{deptno}")
    public Dept queryById(@PathVariable("deptno") Long deptno);

    @GetMapping("dept/list")
    public List<Dept> queryAll();

    @GetMapping("dept/add")
    public boolean addDept(Dept dept);
}
