package com.service;

import com.entity.Product_genre;

import java.util.List;
import java.util.Map;

public interface IProduct_genreService {
    List selectGenreAll();
    List select_genreMap(Map map);
    int deleteByPrimaryKey(Long pid);

    int insert(Product_genre product_genre);

    int insertSelective(Product_genre product_genre);

    Product_genre selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(Product_genre product_genre);

    int updateByPrimaryKey(Product_genre product_genre);
}
