package com.dao;

import com.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface ProductMapper {
    List<Product> selectAll();
    Map<String,Object> selectProductMap(Integer productid);
    List<Map<String,HashMap>> selectProductListMap(Map<String,Object> map);
    int deleteByPrimaryKey(Long productid);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Long productid);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}