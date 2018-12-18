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
@Service("product_graphicsService")
public class Product_graphicsService implements  IProduct_graphicsService{
    @Autowired
    private Product_graphicsMapper product_graphicsMapper;

    @Override
    public List selectGrapAll() {
        return product_graphicsMapper.selectGrapAll();
    }

    @Override
    public List select_graphicsMap(Map map) {
        return product_graphicsMapper.select_graphicsMap(map);
    }


    @Override
    public int deleteByPrimaryKey(Long pid) {

        return product_graphicsMapper.deleteByPrimaryKey(pid);
    }
    @Override
    public int insert(Product_graphics product_graphics) {

        return product_graphicsMapper.insert(product_graphics);
    }
    @Override
    public int insertSelective(Product_graphics product_graphics) {
        return product_graphicsMapper.insertSelective(product_graphics);
    }
    @Override
    public Product_graphics selectByPrimaryKey(Long pid) {
        return product_graphicsMapper.selectByPrimaryKey(pid);
    }
    @Override
    public int updateByPrimaryKeySelective(Product_graphics product_graphics) {
        return product_graphicsMapper.updateByPrimaryKeySelective(product_graphics);
    }
    @Override
    public int updateByPrimaryKey(Product_graphics product_graphics) {
        return product_graphicsMapper.updateByPrimaryKey(product_graphics);
    }
}