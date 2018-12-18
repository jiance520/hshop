package com.dao;

import com.entity.Product_os;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Product_osMapper {
    List selectOsAll();
    List select_osMap(Map map);
    int deleteByPrimaryKey(Long osid);

    int insert(Product_os record);

    int insertSelective(Product_os record);

    Product_os selectByPrimaryKey(Long osid);

    int updateByPrimaryKeySelective(Product_os record);

    int updateByPrimaryKey(Product_os record);
}