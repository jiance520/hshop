package com.service;

import com.entity.Shopcart;

import java.util.List;
import java.util.Map;

public interface IShopcartService {
    List select_shopcartAll();
    List select_shopcartMap(Map map);
    int deleteByPrimaryKey(Long sid);

    int insert(Shopcart shopcart);

    int insertSelective(Shopcart shopcart);

    Shopcart selectByPrimaryKey(Long sid);

    int updateByPrimaryKeySelective(Shopcart shopcart);

    int updateByPrimaryKey(Shopcart shopcart);
}
