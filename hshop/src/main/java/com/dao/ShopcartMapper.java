package com.dao;

import com.entity.Shopcart;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ShopcartMapper {
    List select_shopcartAll();
    List select_shopcartMap(Map map);
    int deleteByPrimaryKey(Long id);

    int insert(Shopcart record);

    int insertSelective(Shopcart record);

    Shopcart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Shopcart record);

    int updateByPrimaryKey(Shopcart record);
}