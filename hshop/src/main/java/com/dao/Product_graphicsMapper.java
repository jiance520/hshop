package com.dao;

import com.entity.Product_graphics;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Product_graphicsMapper {
    List selectGrapAll();
    List select_graphicsMap(Map map);
    int deleteByPrimaryKey(Long driveid);

    int insert(Product_graphics record);

    int insertSelective(Product_graphics record);

    Product_graphics selectByPrimaryKey(Long driveid);

    int updateByPrimaryKeySelective(Product_graphics record);

    int updateByPrimaryKey(Product_graphics record);
}