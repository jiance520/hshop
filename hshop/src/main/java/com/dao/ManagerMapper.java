package com.dao;

import com.entity.Manager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ManagerMapper {
    Manager selectLogin(Map map);
    List selectAll();
    List select_managerMap(Map map);
    int deleteByPrimaryKey(Long mid);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Long mid);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}