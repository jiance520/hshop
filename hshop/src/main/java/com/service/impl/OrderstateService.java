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
@Service("orderstateService")
public class OrderstateService implements  IOrderstateService{
    @Autowired
    private OrderstateMapper orderstateMapper;

    @Override
    public List selectOrderStateAll() {
        return orderstateMapper.selectOrderStateAll();
    }

    @Override
    public List select_orderstateMap(Map map) {
        return orderstateMapper.select_orderstateMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long oid) {

        return orderstateMapper.deleteByPrimaryKey(oid);
    }
    @Override
    public int insert(Orderstate orderstate) {

        return orderstateMapper.insert(orderstate);
    }
    @Override
    public int insertSelective(Orderstate orderstate) {
        return orderstateMapper.insertSelective(orderstate);
    }
    @Override
    public Orderstate selectByPrimaryKey(Long oid) {
        return orderstateMapper.selectByPrimaryKey(oid);
    }
    @Override
    public int updateByPrimaryKeySelective(Orderstate orderstate) {
        return orderstateMapper.updateByPrimaryKeySelective(orderstate);
    }
    @Override
    public int updateByPrimaryKey(Orderstate orderstate) {
        return orderstateMapper.updateByPrimaryKey(orderstate);
    }
}
