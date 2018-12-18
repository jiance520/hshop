package com.dao;

import com.entity.Shoplog;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ShoplogMapper {
    List select_shoplogAll();
    List select_shoplogMap(Map map);
    int deleteByPrimaryKey(Long logid);

    int insert(Shoplog record);

    int insertSelective(Shoplog record);

    Shoplog selectByPrimaryKey(Long logid);

    int updateByPrimaryKeySelective(Shoplog record);

    int updateByPrimaryKey(Shoplog record);
}