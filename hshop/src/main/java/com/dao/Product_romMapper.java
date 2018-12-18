package com.dao;

import com.entity.Product_rom;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Product_romMapper {
    List selectRomAll();
    List select_romMap(Map map);
    int deleteByPrimaryKey(Long driveid);

    int insert(Product_rom record);

    int insertSelective(Product_rom record);

    Product_rom selectByPrimaryKey(Long driveid);

    int updateByPrimaryKeySelective(Product_rom record);

    int updateByPrimaryKey(Product_rom record);
}