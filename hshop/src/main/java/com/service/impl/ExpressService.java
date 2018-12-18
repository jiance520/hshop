package com.service.impl;

import com.dao.ExpressMapper;
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
@Service("expressService")
public class ExpressService implements IExpressService {
    @Autowired
    private ExpressMapper expressMapper;

    @Override
    public List selectAll() {
        return expressMapper.selectAll();
    }

    @Override
    public List select_expressMap(Map map) {
        return expressMapper.select_expressMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long eid) {
        return expressMapper.deleteByPrimaryKey(eid);
    }

    @Override
    public int insert(Express express) {
        return expressMapper.insert(express);
    }

    @Override
    public int insertSelective(Express express) {
        return expressMapper.insertSelective(express);
    }

    @Override
    public Express selectByPrimaryKey(Long eid) {
        return expressMapper.selectByPrimaryKey(eid);
    }

    @Override
    public int updateByPrimaryKeySelective(Express express) {
        return expressMapper.updateByPrimaryKeySelective(express);
    }

    @Override
    public int updateByPrimaryKey(Express express) {
        return expressMapper.updateByPrimaryKey(express);
    }
}