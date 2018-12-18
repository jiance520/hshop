package com.service;

import com.entity.Advert;

import java.util.List;
import java.util.Map;

public interface IAdvertService {
    List select_advertAll();
    List select_advertMap(Map map);
    int deleteByPrimaryKey(Long aid);

    int insert(Advert advert);

    int insertSelective(Advert advert);

    Advert selectByPrimaryKey(Long aid);

    int updateByPrimaryKeySelective(Advert advert);

    int updateByPrimaryKey(Advert advert);
}
