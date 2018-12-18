package com.dao;

import com.entity.Product_dvdrom;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Product_dvdromMapper {
    List selectDvdAll();
    List select_dvdMap(Map map);
    int deleteByPrimaryKey(Long driveid);

    int insert(Product_dvdrom record);

    int insertSelective(Product_dvdrom record);

    Product_dvdrom selectByPrimaryKey(Long driveid);

    int updateByPrimaryKeySelective(Product_dvdrom record);

    int updateByPrimaryKey(Product_dvdrom record);
}