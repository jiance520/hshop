package com.service;

import com.entity.Service;

import java.util.List;
import java.util.Map;

public interface IServiceService {
    List select_serviceAll();
    List select_serviceMap(Map map);
    int deleteByPrimaryKey(Long sid);

    int insert(Service service);

    int insertSelective(Service service);

    Service selectByPrimaryKey(Long sid);

    int updateByPrimaryKeySelective(Service service);

    int updateByPrimaryKey(Service service);
}
