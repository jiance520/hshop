package com.service;

import com.entity.Product_os;

import java.util.List;
import java.util.Map;

public interface IProduct_osService {
    List selectOsAll();
    List select_osMap(Map map);
    int deleteByPrimaryKey(Long pid);

    int insert(Product_os product_os);

    int insertSelective(Product_os product_os);

    Product_os selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(Product_os product_os);

    int updateByPrimaryKey(Product_os product_os);
}
