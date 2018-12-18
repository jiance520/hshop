package com.service;

import com.entity.Product_rom;

import java.util.List;
import java.util.Map;

public interface IProduct_romService {
    List selectRomAll();
    List select_romMap(Map map);
    int deleteByPrimaryKey(Long pid);

    int insert(Product_rom product_rom);

    int insertSelective(Product_rom product_rom);

    Product_rom selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(Product_rom product_rom);

    int updateByPrimaryKey(Product_rom product_rom);
}
