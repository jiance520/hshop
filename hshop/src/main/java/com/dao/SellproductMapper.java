package com.dao;

import com.entity.Sellproduct;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SellproductMapper {
    List<Sellproduct> selectAll();
    List selectSellInfo();
    int deleteByPrimaryKey(Long spid);

    int insert(Sellproduct record);

    int insertSelective(Sellproduct record);

    Sellproduct selectByPrimaryKey(Long spid);

    int updateByPrimaryKeySelective(Sellproduct record);

    int updateByPrimaryKey(Sellproduct record);
}