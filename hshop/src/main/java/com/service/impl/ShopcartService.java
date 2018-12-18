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
@Service("shopcartService")
public class ShopcartService implements  IShopcartService{
    @Autowired
    private ShopcartMapper shopcartMapper;

    @Override
    public List select_shopcartAll() {
        return shopcartMapper.select_shopcartAll();
    }

    @Override
    public List select_shopcartMap(Map map) {
        return shopcartMapper.select_shopcartMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long sid) {

        return shopcartMapper.deleteByPrimaryKey(sid);
    }
    @Override
    public int insert(Shopcart shopcart) {

        return shopcartMapper.insert(shopcart);
    }
    @Override
    public int insertSelective(Shopcart shopcart) {
        return shopcartMapper.insertSelective(shopcart);
    }
    @Override
    public Shopcart selectByPrimaryKey(Long sid) {
        return shopcartMapper.selectByPrimaryKey(sid);
    }
    @Override
    public int updateByPrimaryKeySelective(Shopcart shopcart) {
        return shopcartMapper.updateByPrimaryKeySelective(shopcart);
    }
    @Override
    public int updateByPrimaryKey(Shopcart shopcart) {
        return shopcartMapper.updateByPrimaryKey(shopcart);
    }
}