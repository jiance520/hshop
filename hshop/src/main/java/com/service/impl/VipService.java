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
@Service("vipService")
public class VipService implements  IVipService{
    @Autowired
    private VipMapper vipMapper;

    @Override
    public List<Vip> selectAll() {
        return vipMapper.selectAll();
    }

    @Override
    public List select_vipMap(Map map) {
        return vipMapper.select_vipMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long vid) {

        return vipMapper.deleteByPrimaryKey(vid);
    }
    @Override
    public int insert(Vip vip) {

        return vipMapper.insert(vip);
    }
    @Override
    public int insertSelective(Vip vip) {
        return vipMapper.insertSelective(vip);
    }
    @Override
    public Vip selectByPrimaryKey(Long vid) {
        return vipMapper.selectByPrimaryKey(vid);
    }
    @Override
    public int updateByPrimaryKeySelective(Vip vip) {
        return vipMapper.updateByPrimaryKeySelective(vip);
    }
    @Override
    public int updateByPrimaryKey(Vip vip) {
        return vipMapper.updateByPrimaryKey(vip);
    }
}