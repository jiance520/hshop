package com.service;

import com.entity.Express;

import java.util.List;
import java.util.Map;

public interface IExpressService {
    List selectAll();
    List select_expressMap(Map map);
    int deleteByPrimaryKey(Long eid);

    int insert(Express express);

    int insertSelective(Express express);

    Express selectByPrimaryKey(Long eid);

    int updateByPrimaryKeySelective(Express express);

    int updateByPrimaryKey(Express express);
}
