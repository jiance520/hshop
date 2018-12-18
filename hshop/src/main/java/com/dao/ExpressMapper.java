package com.dao;

import com.entity.Express;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ExpressMapper {
    List selectAll();
    List select_expressMap(Map map);
    int deleteByPrimaryKey(Long eid);

    int insert(Express record);

    int insertSelective(Express record);

    Express selectByPrimaryKey(Long eid);

    int updateByPrimaryKeySelective(Express record);

    int updateByPrimaryKey(Express record);
}