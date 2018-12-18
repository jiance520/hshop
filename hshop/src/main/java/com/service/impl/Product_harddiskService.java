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
@Service("product_harddiskService")
public class Product_harddiskService implements  IProduct_harddiskService{
    @Autowired
    private Product_harddiskMapper product_harddiskMapper;

    @Override
    public List selectDiskAll() {
        return product_harddiskMapper.selectDiskAll();
    }

    @Override
    public List select_diskMap(Map map) {
        return product_harddiskMapper.select_diskMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long pid) {

        return product_harddiskMapper.deleteByPrimaryKey(pid);
    }
    @Override
    public int insert(Product_harddisk product_harddisk) {

        return product_harddiskMapper.insert(product_harddisk);
    }
    @Override
    public int insertSelective(Product_harddisk product_harddisk) {
        return product_harddiskMapper.insertSelective(product_harddisk);
    }
    @Override
    public Product_harddisk selectByPrimaryKey(Long pid) {
        return product_harddiskMapper.selectByPrimaryKey(pid);
    }
    @Override
    public int updateByPrimaryKeySelective(Product_harddisk product_harddisk) {
        return product_harddiskMapper.updateByPrimaryKeySelective(product_harddisk);
    }
    @Override
    public int updateByPrimaryKey(Product_harddisk product_harddisk) {
        return product_harddiskMapper.updateByPrimaryKey(product_harddisk);
    }
}