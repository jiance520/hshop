package com.service.impl;

import com.dao.*;

import com.entity.*;
import com.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service("productService")
public class ProductService implements  IProductService{
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> selectAll() {
        return productMapper.selectAll();
    }

    @Override
    public Map<String, Object> selectProductMap(Integer productid) {
        return productMapper.selectProductMap(productid);
    }

    @Override
    public List<Map<String, HashMap>> selectProductListMap(Map<String, Object> map) {
        return productMapper.selectProductListMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long pid) {

        return productMapper.deleteByPrimaryKey(pid);
    }
    @Override
    public int insert(Product product) {

        return productMapper.insert(product);
    }
    @Override
    public int insertSelective(Product product) {
        return productMapper.insertSelective(product);
    }
    @Override
    public Product selectByPrimaryKey(Long pid) {
        return productMapper.selectByPrimaryKey(pid);
    }
    @Override
    public int updateByPrimaryKeySelective(Product product) {
        return productMapper.updateByPrimaryKeySelective(product);
    }
    @Override
    public int updateByPrimaryKey(Product product) {
        return productMapper.updateByPrimaryKey(product);
    }
}