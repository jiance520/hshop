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
@Service("sellorderService")
public class SellorderService implements  ISellorderService{
    @Autowired
    private SellorderMapper sellorderMapper;

    @Override
    public List selectAll() {
        return sellorderMapper.selectAll();
    }

    @Override
    public List selectSellOrderMapSearchAll(Map map) {
        return sellorderMapper.selectSellOrderMapSearchAll(map);
    }

    @Override
    public List<Sellorder> selectByStateId(Long orderstateid) {
        return sellorderMapper.selectByStateId(orderstateid);
    }

    @Override
    public int deleteByPrimaryKey(Long sid) {

        return sellorderMapper.deleteByPrimaryKey(sid);
    }
    @Override
    public int insert(Sellorder sellorder) {

        return sellorderMapper.insert(sellorder);
    }
    @Override
    public int insertSelective(Sellorder sellorder) {
        return sellorderMapper.insertSelective(sellorder);
    }
    @Override
    public Sellorder selectByPrimaryKey(Long sid) {
        return sellorderMapper.selectByPrimaryKey(sid);
    }
    @Override
    public int updateByPrimaryKeySelective(Sellorder sellorder) {
        return sellorderMapper.updateByPrimaryKeySelective(sellorder);
    }
    @Override
    public int updateByPrimaryKey(Sellorder sellorder) {
        return sellorderMapper.updateByPrimaryKey(sellorder);
    }
}