package com.dao;

import com.entity.Product_harddisk;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Product_harddiskMapper {
    List selectDiskAll();
    List select_diskMap(Map map);
    int deleteByPrimaryKey(Long driveid);

    int insert(Product_harddisk record);

    int insertSelective(Product_harddisk record);

    Product_harddisk selectByPrimaryKey(Long driveid);

    int updateByPrimaryKeySelective(Product_harddisk record);

    int updateByPrimaryKey(Product_harddisk record);
}