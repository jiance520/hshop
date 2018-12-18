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
@Service("product_styleService")
public class Product_styleService implements  IProduct_styleService{
    @Autowired
    private Product_styleMapper product_styleMapper;

    @Override
    public List selectStyleAll() {
        return product_styleMapper.selectStyleAll();
    }

    @Override
    public List select_styleMap(Map map) {
        return product_styleMapper.select_styleMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long pid) {

        return product_styleMapper.deleteByPrimaryKey(pid);
    }
    @Override
    public int insert(Product_style product_style) {

        return product_styleMapper.insert(product_style);
    }
    @Override
    public int insertSelective(Product_style product_style) {
        return product_styleMapper.insertSelective(product_style);
    }
    @Override
    public Product_style selectByPrimaryKey(Long pid) {
        return product_styleMapper.selectByPrimaryKey(pid);
    }
    @Override
    public int updateByPrimaryKeySelective(Product_style product_style) {
        return product_styleMapper.updateByPrimaryKeySelective(product_style);
    }
    @Override
    public int updateByPrimaryKey(Product_style product_style) {
        return product_styleMapper.updateByPrimaryKey(product_style);
    }
}