package com.wzy.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.concurrent.locks.Lock;

@Data
@NoArgsConstructor
//开启链式写法
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    //微服务，一个服务对用一个数据库，同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname){
        this.dname = dname;
    }
}
