package com.dao;

import com.entity.Product_brand;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Product_brandMapper {
    List select_brandAll();
    List select_brandMap(Map map);
    int deleteByPrimaryKey(Long brandid);

    int insert(Product_brand record);

    int insertSelective(Product_brand record);

    Product_brand selectByPrimaryKey(Long brandid);

    int updateByPrimaryKeySelective(Product_brand record);

    int updateByPrimaryKey(Product_brand record);
}