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
@Service("serviceService")
public class ServiceService implements  IServiceService{
    @Autowired
    private ServiceMapper serviceMapper;

    @Override
    public List select_serviceAll() {
        return serviceMapper.select_serviceAll();
    }

    @Override
    public List select_serviceMap(Map map) {
        return serviceMapper.select_serviceMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long sid) {

        return serviceMapper.deleteByPrimaryKey(sid);
    }
    @Override
    public int insert(com.entity.Service service) {

        return serviceMapper.insert(service);
    }
    @Override
    public int insertSelective(com.entity.Service service) {
        return serviceMapper.insertSelective(service);
    }
    @Override
    public com.entity.Service selectByPrimaryKey(Long sid) {
        return serviceMapper.selectByPrimaryKey(sid);
    }
    @Override
    public int updateByPrimaryKeySelective(com.entity.Service service) {
        return serviceMapper.updateByPrimaryKeySelective(service);
    }
    @Override
    public int updateByPrimaryKey(com.entity.Service service) {
        return serviceMapper.updateByPrimaryKey(service);
    }
}