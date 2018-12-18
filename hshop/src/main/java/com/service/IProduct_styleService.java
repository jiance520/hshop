package com.service;

import com.entity.Product_style;

import java.util.List;
import java.util.Map;

public interface IProduct_styleService {
    List selectStyleAll();
    List select_styleMap(Map map);
    int deleteByPrimaryKey(Long pid);

    int insert(Product_style product_style);

    int insertSelective(Product_style product_style);

    Product_style selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(Product_style product_style);

    int updateByPrimaryKey(Product_style product_style);
}
