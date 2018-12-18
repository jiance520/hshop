package com.service;

import com.entity.Product_screen;

import java.util.List;
import java.util.Map;

public interface IProduct_screenService {
    List selectScreenAll();
    List select_screenMap(Map map);
    int deleteByPrimaryKey(Long pid);

    int insert(Product_screen product_screen);

    int insertSelective(Product_screen product_screen);

    Product_screen selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(Product_screen product_screen);

    int updateByPrimaryKey(Product_screen product_screen);
}
