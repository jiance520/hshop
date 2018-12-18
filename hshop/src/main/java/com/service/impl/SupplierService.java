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
@Service("supplierService")
public class SupplierService implements  ISupplierService{
    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public List selectSupplierAll() {
        return supplierMapper.selectSupplierAll();
    }

    @Override
    public List select_supplierMap(Map map) {
        return supplierMapper.select_supplierMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long sid) {

        return supplierMapper.deleteByPrimaryKey(sid);
    }
    @Override
    public int insert(Supplier supplier) {

        return supplierMapper.insert(supplier);
    }
    @Override
    public int insertSelective(Supplier supplier) {
        return supplierMapper.insertSelective(supplier);
    }
    @Override
    public Supplier selectByPrimaryKey(Long sid) {
        return supplierMapper.selectByPrimaryKey(sid);
    }
    @Override
    public int updateByPrimaryKeySelective(Supplier supplier) {
        return supplierMapper.updateByPrimaryKeySelective(supplier);
    }
    @Override
    public int updateByPrimaryKey(Supplier supplier) {
        return supplierMapper.updateByPrimaryKey(supplier);
    }
}