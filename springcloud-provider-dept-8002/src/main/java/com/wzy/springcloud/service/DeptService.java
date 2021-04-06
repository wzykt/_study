package com.wzy.springcloud.service;

import com.wzy.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {

    boolean addDept(Dept dept);

    Dept queryById(Long deptno);

    List<Dept> queryAll();

}
