package com.service;

import com.entity.Orderstate;

import java.util.List;
import java.util.Map;

public interface IOrderstateService {
    List selectOrderStateAll();
    List select_orderstateMap(Map map);
    int deleteByPrimaryKey(Long oid);

    int insert(Orderstate orderstate);

    int insertSelective(Orderstate orderstate);

    Orderstate selectByPrimaryKey(Long oid);

    int updateByPrimaryKeySelective(Orderstate orderstate);

    int updateByPrimaryKey(Orderstate orderstate);
}
