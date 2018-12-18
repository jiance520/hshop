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
@Service("sellproductService")
public class SellproductService implements  ISellproductService{
    @Autowired
    private SellproductMapper sellproductMapper;

    @Override
    public List<Sellproduct> selectAll() {
        return sellproductMapper.selectAll();
    }

    @Override
    public List  selectSellInfo() {
        return sellproductMapper.selectSellInfo();
    }

    @Override
    public int deleteByPrimaryKey(Long sid) {

        return sellproductMapper.deleteByPrimaryKey(sid);
    }
    @Override
    public int insert(Sellproduct sellproduct) {

        return sellproductMapper.insert(sellproduct);
    }
    @Override
    public int insertSelective(Sellproduct sellproduct) {
        return sellproductMapper.insertSelective(sellproduct);
    }
    @Override
    public Sellproduct selectByPrimaryKey(Long sid) {
        return sellproductMapper.selectByPrimaryKey(sid);
    }
    @Override
    public int updateByPrimaryKeySelective(Sellproduct sellproduct) {
        return sellproductMapper.updateByPrimaryKeySelective(sellproduct);
    }
    @Override
    public int updateByPrimaryKey(Sellproduct sellproduct) {
        return sellproductMapper.updateByPrimaryKey(sellproduct);
    }
}