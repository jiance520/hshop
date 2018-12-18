package com.service;

import com.entity.Vip;

import java.util.List;
import java.util.Map;

public interface IVipService {
    List<Vip> selectAll();
    List select_vipMap(Map map);
    int deleteByPrimaryKey(Long vid);

    int insert(Vip vip);

    int insertSelective(Vip vip);

    Vip selectByPrimaryKey(Long vid);

    int updateByPrimaryKeySelective(Vip vip);

    int updateByPrimaryKey(Vip vip);
}
