package com.dao;

import com.entity.Product_cpu;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Product_cpuMapper {
    List selectCpuAction();
    List select_cpuMap(Map map);
    int deleteByPrimaryKey(Long driveid);

    int insert(Product_cpu record);

    int insertSelective(Product_cpu record);

    Product_cpu selectByPrimaryKey(Long driveid);

    int updateByPrimaryKeySelective(Product_cpu record);

    int updateByPrimaryKey(Product_cpu record);
}