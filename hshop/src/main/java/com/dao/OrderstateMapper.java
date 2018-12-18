package com.dao;

import com.entity.Orderstate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OrderstateMapper {
    List selectOrderStateAll();
    List select_orderstateMap(Map map);

    int deleteByPrimaryKey(Long stateid);

    int insert(Orderstate record);

    int insertSelective(Orderstate record);

    Orderstate selectByPrimaryKey(Long stateid);

    int updateByPrimaryKeySelective(Orderstate record);

    int updateByPrimaryKey(Orderstate record);
}