package com.service.impl;

import com.dao.*;

import com.entity.*;
import com.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service("product_cpuService")
public class Product_cpuService implements  IProduct_cpuService{
    @Autowired
    private Product_cpuMapper product_cpuMapper;

    @Override
    public List selectCpuAction() {
        return product_cpuMapper.selectCpuAction();
    }

    @Override
    public List select_cpuMap(Map map) {
        return product_cpuMapper.select_cpuMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long pid) {

        return product_cpuMapper.deleteByPrimaryKey(pid);
    }
    @Override
    public int insert(Product_cpu product_cpu) {

        return product_cpuMapper.insert(product_cpu);
    }
    @Override
    public int insertSelective(Product_cpu product_cpu) {
        return product_cpuMapper.insertSelective(product_cpu);
    }
    @Override
    public Product_cpu selectByPrimaryKey(Long pid) {
        return product_cpuMapper.selectByPrimaryKey(pid);
    }
    @Override
    public int updateByPrimaryKeySelective(Product_cpu product_cpu) {
        return product_cpuMapper.updateByPrimaryKeySelective(product_cpu);
    }
    @Override
    public int updateByPrimaryKey(Product_cpu product_cpu) {
        return product_cpuMapper.updateByPrimaryKey(product_cpu);
    }
}