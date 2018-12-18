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
@Service("product_romService")
public class Product_romService implements  IProduct_romService{
    @Autowired
    private Product_romMapper product_romMapper;

    @Override
    public List selectRomAll() {
        return product_romMapper.selectRomAll();
    }

    @Override
    public List select_romMap(Map map) {
        return product_romMapper.select_romMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long pid) {

        return product_romMapper.deleteByPrimaryKey(pid);
    }
    @Override
    public int insert(Product_rom product_rom) {

        return product_romMapper.insert(product_rom);
    }
    @Override
    public int insertSelective(Product_rom product_rom) {
        return product_romMapper.insertSelective(product_rom);
    }
    @Override
    public Product_rom selectByPrimaryKey(Long pid) {
        return product_romMapper.selectByPrimaryKey(pid);
    }
    @Override
    public int updateByPrimaryKeySelective(Product_rom product_rom) {
        return product_romMapper.updateByPrimaryKeySelective(product_rom);
    }
    @Override
    public int updateByPrimaryKey(Product_rom product_rom) {
        return product_romMapper.updateByPrimaryKey(product_rom);
    }
}