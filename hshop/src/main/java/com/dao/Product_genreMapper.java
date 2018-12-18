package com.dao;

import com.entity.Product_genre;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Product_genreMapper {
    List selectGenreAll();
    List select_genreMap(Map map);
    int deleteByPrimaryKey(Long genreid);

    int insert(Product_genre record);

    int insertSelective(Product_genre record);

    Product_genre selectByPrimaryKey(Long genreid);

    int updateByPrimaryKeySelective(Product_genre record);

    int updateByPrimaryKey(Product_genre record);
}