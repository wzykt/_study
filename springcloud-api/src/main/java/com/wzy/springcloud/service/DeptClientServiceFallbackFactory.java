package com.wzy.springcloud.service;


import com.wzy.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    //为中断的服务提供默认的实现（缺省值）
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            public Dept queryById(Long deptno) {
                return new Dept().setDb_source("没有数据")
                        .setDeptno(deptno)
                        .setDname("id=>"+deptno+"没有对应的服务，这个服务已经中断");
            }
            public List<Dept> queryAll() {
                return null;
            }
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
