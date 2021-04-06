package com.wzy.springcloud.service;

import com.wzy.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptService {

    boolean addDept(Dept dept);

    Dept queryById(Long deptno);

    List<Dept> queryAll();

}
