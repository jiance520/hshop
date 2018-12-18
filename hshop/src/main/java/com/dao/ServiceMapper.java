package com.dao;

import com.entity.Service;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ServiceMapper {
    List select_serviceAll();
    List select_serviceMap(Map map);
    int deleteByPrimaryKey(Long serviceid);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Long serviceid);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);
}