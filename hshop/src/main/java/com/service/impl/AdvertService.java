package com.service.impl;

import com.dao.AdvertMapper;
import com.entity.Advert;
import com.service.IAdvertService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service("advertService")
public class AdvertService implements IAdvertService {
    @Autowired
    private AdvertMapper advertMapper;

    @Override
    public List select_advertAll() {
        return advertMapper.select_advertAll();
    }

    @Override
    public List select_advertMap(Map map) {
        return advertMapper.select_advertMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long aid) {
        return advertMapper.deleteByPrimaryKey(aid);
    }

    @Override
    public int insert(Advert advert) {
        return advertMapper.insert(advert);
    }

    @Override
    public int insertSelective(Advert advert) {
        return advertMapper.insertSelective(advert);
    }

    @Override
    public Advert selectByPrimaryKey(Long aid) {
        return advertMapper.selectByPrimaryKey(aid);
    }

    @Override
    public int updateByPrimaryKeySelective(Advert advert) {
        return advertMapper.updateByPrimaryKeySelective(advert);
    }

    @Override
    public int updateByPrimaryKey(Advert advert) {
        return advertMapper.updateByPrimaryKey(advert);
    }
}
