package com.dao;

import com.entity.Supplier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SupplierMapper {
    List selectSupplierAll();
    List select_supplierMap(Map map);
    int deleteByPrimaryKey(Long ssid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Long ssid);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}