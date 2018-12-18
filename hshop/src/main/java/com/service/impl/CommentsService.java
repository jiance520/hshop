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
@Service("commentsService")
public class CommentsService implements  ICommentsService{
    @Autowired
    private CommentsMapper commentsMapper;

    @Override
    public List select_commentsAll() {
        return commentsMapper.select_commentsAll();
    }

    @Override
    public List select_commentsMap(Map map) {
        return commentsMapper.select_commentsMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long cid) {

        return commentsMapper.deleteByPrimaryKey(cid);
    }
    @Override
    public int insert(Comments comments) {

        return commentsMapper.insert(comments);
    }
    @Override
    public int insertSelective(Comments comments) {
        return commentsMapper.insertSelective(comments);
    }
    @Override
    public Comments selectByPrimaryKey(Long cid) {
        return commentsMapper.selectByPrimaryKey(cid);
    }
    @Override
    public int updateByPrimaryKeySelective(Comments comments) {
        return commentsMapper.updateByPrimaryKeySelective(comments);
    }
    @Override
    public int updateByPrimaryKey(Comments comments) {
        return commentsMapper.updateByPrimaryKey(comments);
    }
}