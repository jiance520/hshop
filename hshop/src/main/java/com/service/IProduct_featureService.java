package com.service;

import com.entity.Product_feature;

import java.util.List;
import java.util.Map;

public interface IProduct_featureService {
    List selectFeatAll();
    List select_featMap(Map map);
    int deleteByPrimaryKey(Long pid);

    int insert(Product_feature product_feature);

    int insertSelective(Product_feature product_feature);

    Product_feature selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(Product_feature product_feature);

    int updateByPrimaryKey(Product_feature product_feature);
}
