package com.dao;

import com.entity.Product_feature;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Product_featureMapper {
    List selectFeatAll();
    List select_featMap(Map map);
    int deleteByPrimaryKey(Long featureid);

    int insert(Product_feature record);

    int insertSelective(Product_feature record);

    Product_feature selectByPrimaryKey(Long featureid);

    int updateByPrimaryKeySelective(Product_feature record);

    int updateByPrimaryKey(Product_feature record);
}