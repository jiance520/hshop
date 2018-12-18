package com.service;

import com.entity.Sellproduct;

import java.util.List;
import java.util.Map;

public interface ISellproductService {
    List<Sellproduct> selectAll();
    List  selectSellInfo();
    int deleteByPrimaryKey(Long sid);

    int insert(Sellproduct sellproduct);

    int insertSelective(Sellproduct sellproduct);

    Sellproduct selectByPrimaryKey(Long sid);

    int updateByPrimaryKeySelective(Sellproduct sellproduct);

    int updateByPrimaryKey(Sellproduct sellproduct);
}
