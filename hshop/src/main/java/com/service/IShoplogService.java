package com.service;

import com.entity.Shoplog;

import java.util.List;
import java.util.Map;

public interface IShoplogService {
    List select_shoplogAll();
    List select_shoplogMap(Map map);
    int deleteByPrimaryKey(Long sid);

    int insert(Shoplog shoplog);

    int insertSelective(Shoplog shoplog);

    Shoplog selectByPrimaryKey(Long sid);

    int updateByPrimaryKeySelective(Shoplog shoplog);

    int updateByPrimaryKey(Shoplog shoplog);
}
