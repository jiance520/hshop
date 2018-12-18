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
@Service("product_screenService")
public class Product_screenService implements  IProduct_screenService{
    @Autowired
    private Product_screenMapper product_screenMapper;

    @Override
    public List selectScreenAll() {
        return product_screenMapper.selectScreenAll();
    }

    @Override
    public List select_screenMap(Map map) {
        return product_screenMapper.select_screenMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long pid) {

        return product_screenMapper.deleteByPrimaryKey(pid);
    }
    @Override
    public int insert(Product_screen product_screen) {

        return product_screenMapper.insert(product_screen);
    }
    @Override
    public int insertSelective(Product_screen product_screen) {
        return product_screenMapper.insertSelective(product_screen);
    }
    @Override
    public Product_screen selectByPrimaryKey(Long pid) {
        return product_screenMapper.selectByPrimaryKey(pid);
    }
    @Override
    public int updateByPrimaryKeySelective(Product_screen product_screen) {
        return product_screenMapper.updateByPrimaryKeySelective(product_screen);
    }
    @Override
    public int updateByPrimaryKey(Product_screen product_screen) {
        return product_screenMapper.updateByPrimaryKey(product_screen);
    }
}