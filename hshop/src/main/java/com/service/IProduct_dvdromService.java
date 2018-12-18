package com.service;

import com.entity.Product_dvdrom;

import java.util.List;
import java.util.Map;

public interface IProduct_dvdromService {
    List selectDvdAll();
    List select_dvdMap(Map map);
    int deleteByPrimaryKey(Long pid);

    int insert(Product_dvdrom product_dvdrom);

    int insertSelective(Product_dvdrom product_dvdrom);

    Product_dvdrom selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(Product_dvdrom product_dvdrom);

    int updateByPrimaryKey(Product_dvdrom product_dvdrom);
}
