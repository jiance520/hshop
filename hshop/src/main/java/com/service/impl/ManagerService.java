package com.service.impl;
import java.util.*;

import com.dao.ManagerMapper;
import com.entity.*;
import com.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@MapperScan(basePackages = "com.dao")
@Service("managerService")
public class ManagerService implements  IManagerService{
    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Manager selectLogin(Map map) {
        return managerMapper.selectLogin(map);
    }

    @Override
    public List selectAll() {
        return managerMapper.selectAll();
    }

    @Override
    public List select_managerMap(Map map) {
        return managerMapper.select_managerMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long mid) {

        return managerMapper.deleteByPrimaryKey(mid);
    }
    @Override
    public int insert(Manager manager) {

        return managerMapper.insert(manager);
    }
    @Override
    public int insertSelective(Manager manager) {
        return managerMapper.insertSelective(manager);
    }
    @Override
    public Manager selectByPrimaryKey(Long mid) {
        return managerMapper.selectByPrimaryKey(mid);
    }
    @Override
    public int updateByPrimaryKeySelective(Manager manager) {
        return managerMapper.updateByPrimaryKeySelective(manager);
    }
    @Override
    public int updateByPrimaryKey(Manager manager) {
        return managerMapper.updateByPrimaryKey(manager);
    }
}
