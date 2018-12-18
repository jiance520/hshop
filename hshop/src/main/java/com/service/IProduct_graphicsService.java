package com.service;

import com.entity.Product_graphics;

import java.util.List;
import java.util.Map;

public interface IProduct_graphicsService {
    List selectGrapAll();
    List select_graphicsMap(Map map);
    int deleteByPrimaryKey(Long pid);

    int insert(Product_graphics product_graphics);

    int insertSelective(Product_graphics product_graphics);

    Product_graphics selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(Product_graphics product_graphics);

    int updateByPrimaryKey(Product_graphics product_graphics);
}
