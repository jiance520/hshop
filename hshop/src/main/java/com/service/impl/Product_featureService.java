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
@Service("product_featureService")
public class Product_featureService implements  IProduct_featureService{
    @Autowired
    private Product_featureMapper product_featureMapper;

    @Override
    public List selectFeatAll() {
        return product_featureMapper.selectFeatAll();
    }

    @Override
    public List select_featMap(Map map) {
        return product_featureMapper.select_featMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long pid) {

        return product_featureMapper.deleteByPrimaryKey(pid);
    }
    @Override
    public int insert(Product_feature product_feature) {

        return product_featureMapper.insert(product_feature);
    }
    @Override
    public int insertSelective(Product_feature product_feature) {
        return product_featureMapper.insertSelective(product_feature);
    }
    @Override
    public Product_feature selectByPrimaryKey(Long pid) {
        return product_featureMapper.selectByPrimaryKey(pid);
    }
    @Override
    public int updateByPrimaryKeySelective(Product_feature product_feature) {
        return product_featureMapper.updateByPrimaryKeySelective(product_feature);
    }
    @Override
    public int updateByPrimaryKey(Product_feature product_feature) {
        return product_featureMapper.updateByPrimaryKey(product_feature);
    }
}