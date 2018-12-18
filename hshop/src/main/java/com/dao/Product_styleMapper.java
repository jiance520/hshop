package com.dao;

import com.entity.Product_style;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Product_styleMapper {
    List selectStyleAll();
    List select_styleMap(Map map);
    int deleteByPrimaryKey(Long styleid);

    int insert(Product_style record);

    int insertSelective(Product_style record);

    Product_style selectByPrimaryKey(Long styleid);

    int updateByPrimaryKeySelective(Product_style record);

    int updateByPrimaryKey(Product_style record);
}