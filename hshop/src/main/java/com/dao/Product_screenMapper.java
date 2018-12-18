package com.dao;

import com.entity.Product_screen;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Product_screenMapper {
    List selectScreenAll();
    List select_screenMap(Map map);
    int deleteByPrimaryKey(Long driveid);

    int insert(Product_screen record);

    int insertSelective(Product_screen record);

    Product_screen selectByPrimaryKey(Long driveid);

    int updateByPrimaryKeySelective(Product_screen record);

    int updateByPrimaryKey(Product_screen record);
}