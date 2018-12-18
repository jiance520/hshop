package com.service.impl;

import com.dao.*;

import com.entity.*;
import com.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service("product_genreService")
public class Product_genreService implements  IProduct_genreService{
    @Autowired
    private Product_genreMapper product_genreMapper;

    @Override
    public List selectGenreAll() {
        return product_genreMapper.selectGenreAll();
    }

    @Override
    public List select_genreMap(Map map) {
        return product_genreMapper.select_genreMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long pid) {

        return product_genreMapper.deleteByPrimaryKey(pid);
    }
    @Override
    public int insert(Product_genre product_genre) {

        return product_genreMapper.insert(product_genre);
    }
    @Override
    public int insertSelective(Product_genre product_genre) {
        return product_genreMapper.insertSelective(product_genre);
    }
    @Override
    public Product_genre selectByPrimaryKey(Long pid) {
        return product_genreMapper.selectByPrimaryKey(pid);
    }
    @Override
    public int updateByPrimaryKeySelective(Product_genre product_genre) {
        return product_genreMapper.updateByPrimaryKeySelective(product_genre);
    }
    @Override
    public int updateByPrimaryKey(Product_genre product_genre) {
        return product_genreMapper.updateByPrimaryKey(product_genre);
    }
}
