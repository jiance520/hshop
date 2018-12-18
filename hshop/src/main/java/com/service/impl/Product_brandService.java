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
@Service("product_brandService")
public class Product_brandService implements  IProduct_brandService{
    @Autowired
    private Product_brandMapper product_brandMapper;

    @Override
    public List select_brandAll() {
        return product_brandMapper.select_brandAll();
    }

    @Override
    public List select_brandMap(Map map) {
        return product_brandMapper.select_brandMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long pid) {

        return product_brandMapper.deleteByPrimaryKey(pid);
    }
    @Override
    public int insert(Product_brand product_brand) {

        return product_brandMapper.insert(product_brand);
    }
    @Override
    public int insertSelective(Product_brand product_brand) {
        return product_brandMapper.insertSelective(product_brand);
    }
    @Override
    public Product_brand selectByPrimaryKey(Long pid) {
        return product_brandMapper.selectByPrimaryKey(pid);
    }
    @Override
    public int updateByPrimaryKeySelective(Product_brand product_brand) {
        return product_brandMapper.updateByPrimaryKeySelective(product_brand);
    }
    @Override
    public int updateByPrimaryKey(Product_brand product_brand) {
        return product_brandMapper.updateByPrimaryKey(product_brand);
    }
}