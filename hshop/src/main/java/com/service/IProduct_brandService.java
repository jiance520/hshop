package com.service;

import com.entity.Product_brand;

import java.util.List;
import java.util.Map;

public interface IProduct_brandService {
    List select_brandAll();
    List select_brandMap(Map map);
    int deleteByPrimaryKey(Long pid);

    int insert(Product_brand product_brand);

    int insertSelective(Product_brand product_brand);

    Product_brand selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(Product_brand product_brand);

    int updateByPrimaryKey(Product_brand product_brand);
}
