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
@Service("shoplogService")
public class ShoplogService implements  IShoplogService{
    @Autowired
    private ShoplogMapper shoplogMapper;

    @Override
    public List select_shoplogAll() {
        return shoplogMapper.select_shoplogAll();
    }

    @Override
    public List select_shoplogMap(Map map) {
        return shoplogMapper.select_shoplogMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long sid) {

        return shoplogMapper.deleteByPrimaryKey(sid);
    }
    @Override
    public int insert(Shoplog shoplog) {

        return shoplogMapper.insert(shoplog);
    }
    @Override
    public int insertSelective(Shoplog shoplog) {
        return shoplogMapper.insertSelective(shoplog);
    }
    @Override
    public Shoplog selectByPrimaryKey(Long sid) {
        return shoplogMapper.selectByPrimaryKey(sid);
    }
    @Override
    public int updateByPrimaryKeySelective(Shoplog shoplog) {
        return shoplogMapper.updateByPrimaryKeySelective(shoplog);
    }
    @Override
    public int updateByPrimaryKey(Shoplog shoplog) {
        return shoplogMapper.updateByPrimaryKey(shoplog);
    }
}
