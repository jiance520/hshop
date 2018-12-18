package com.service;

import com.entity.Product_harddisk;

import java.util.List;
import java.util.Map;

public interface IProduct_harddiskService {
    List selectDiskAll();
    List select_diskMap(Map map);
    int deleteByPrimaryKey(Long pid);

    int insert(Product_harddisk product_harddisk);

    int insertSelective(Product_harddisk product_harddisk);

    Product_harddisk selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(Product_harddisk product_harddisk);

    int updateByPrimaryKey(Product_harddisk product_harddisk);
}
