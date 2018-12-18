package com.service;

import com.entity.Sellorder;

import java.util.List;
import java.util.Map;

public interface ISellorderService {
    List selectAll();
    List selectSellOrderMapSearchAll(Map map);
    List<Sellorder> selectByStateId(Long orderstateid);
    int deleteByPrimaryKey(Long sid);

    int insert(Sellorder sellorder);

    int insertSelective(Sellorder sellorder);

    Sellorder selectByPrimaryKey(Long sid);

    int updateByPrimaryKeySelective(Sellorder sellorder);

    int updateByPrimaryKey(Sellorder sellorder);
}
