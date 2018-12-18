package com.dao;

import com.entity.Vip;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface VipMapper {
    List<Vip> selectAll();
    List select_vipMap(Map map);
    int deleteByPrimaryKey(Long vid);

    int insert(Vip record);

    int insertSelective(Vip record);

    Vip selectByPrimaryKey(Long vid);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);
}