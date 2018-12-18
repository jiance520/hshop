package com.service;

import com.entity.Product_cpu;

import java.util.List;
import java.util.Map;

public interface IProduct_cpuService {
    List selectCpuAction();
    List select_cpuMap(Map map);
    int deleteByPrimaryKey(Long pid);

    int insert(Product_cpu product_cpu);

    int insertSelective(Product_cpu product_cpu);

    Product_cpu selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(Product_cpu product_cpu);

    int updateByPrimaryKey(Product_cpu product_cpu);
}
