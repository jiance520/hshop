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
@Service("product_osService")
public class Product_osService implements  IProduct_osService{
    @Autowired
    private Product_osMapper product_osMapper;

    @Override
    public List selectOsAll() {
        return product_osMapper.selectOsAll();
    }

    @Override
    public List select_osMap(Map map) {
        return product_osMapper.select_osMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long pid) {

        return product_osMapper.deleteByPrimaryKey(pid);
    }
    @Override
    public int insert(Product_os product_os) {

        return product_osMapper.insert(product_os);
    }
    @Override
    public int insertSelective(Product_os product_os) {
        return product_osMapper.insertSelective(product_os);
    }
    @Override
    public Product_os selectByPrimaryKey(Long pid) {
        return product_osMapper.selectByPrimaryKey(pid);
    }
    @Override
    public int updateByPrimaryKeySelective(Product_os product_os) {
        return product_osMapper.updateByPrimaryKeySelective(product_os);
    }
    @Override
    public int updateByPrimaryKey(Product_os product_os) {
        return product_osMapper.updateByPrimaryKey(product_os);
    }
}