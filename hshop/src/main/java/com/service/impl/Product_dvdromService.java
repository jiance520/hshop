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
@Service("product_dvdromService")
public class Product_dvdromService implements  IProduct_dvdromService{
    @Autowired
    private Product_dvdromMapper product_dvdromMapper;

    @Override
    public List selectDvdAll() {
        return product_dvdromMapper.selectDvdAll();
    }

    @Override
    public List select_dvdMap(Map map) {
        return product_dvdromMapper.select_dvdMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long pid) {

        return product_dvdromMapper.deleteByPrimaryKey(pid);
    }
    @Override
    public int insert(Product_dvdrom product_dvdrom) {

        return product_dvdromMapper.insert(product_dvdrom);
    }
    @Override
    public int insertSelective(Product_dvdrom product_dvdrom) {
        return product_dvdromMapper.insertSelective(product_dvdrom);
    }
    @Override
    public Product_dvdrom selectByPrimaryKey(Long pid) {
        return product_dvdromMapper.selectByPrimaryKey(pid);
    }
    @Override
    public int updateByPrimaryKeySelective(Product_dvdrom product_dvdrom) {
        return product_dvdromMapper.updateByPrimaryKeySelective(product_dvdrom);
    }
    @Override
    public int updateByPrimaryKey(Product_dvdrom product_dvdrom) {
        return product_dvdromMapper.updateByPrimaryKey(product_dvdrom);
    }
}
