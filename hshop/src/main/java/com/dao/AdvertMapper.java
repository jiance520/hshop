package com.dao;

import com.entity.Advert;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AdvertMapper {
    List select_advertAll();
    List select_advertMap(Map map);
    int deleteByPrimaryKey(Long aid);

    int insert(Advert record);

    int insertSelective(Advert record);

    Advert selectByPrimaryKey(Long aid);

    int updateByPrimaryKeySelective(Advert record);

    int updateByPrimaryKey(Advert record);
}