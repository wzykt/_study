package com.wzy.springcloud.service;

import com.wzy.springcloud.dao.DeptDao;
import com.wzy.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept queryById(Long deptno) {
        return deptDao.queryById(deptno);
    }

    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
