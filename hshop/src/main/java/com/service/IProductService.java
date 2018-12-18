package com.service;

import com.entity.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IProductService {
    List<Product> selectAll();
    Map<String,Object> selectProductMap(Integer productid);
    List<Map<String,HashMap>> selectProductListMap(Map<String,Object> map);
    int deleteByPrimaryKey(Long pid);

    int insert(Product product);

    int insertSelective(Product product);

    Product selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(Product product);

    int updateByPrimaryKey(Product product);
}
