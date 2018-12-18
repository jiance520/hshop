package com.service;

import com.entity.Supplier;

import java.util.List;
import java.util.Map;

public interface ISupplierService {
    List selectSupplierAll();
    List select_supplierMap(Map map);
    int deleteByPrimaryKey(Long sid);

    int insert(Supplier supplier);

    int insertSelective(Supplier supplier);

    Supplier selectByPrimaryKey(Long sid);

    int updateByPrimaryKeySelective(Supplier supplier);

    int updateByPrimaryKey(Supplier supplier);
}
