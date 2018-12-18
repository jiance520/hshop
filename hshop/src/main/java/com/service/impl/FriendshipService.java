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
@Service("friendshipService")
public class FriendshipService implements  IFriendshipService{
    @Autowired
    private FriendshipMapper friendshipMapper;

    @Override
    public List select_friendshipAll() {
        return friendshipMapper.select_friendshipAll();
    }

    @Override
    public List select_friendshipMap(Map map) {
        return friendshipMapper.select_friendshipMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long fid) {

        return friendshipMapper.deleteByPrimaryKey(fid);
    }
    @Override
    public int insert(Friendship friendship) {

        return friendshipMapper.insert(friendship);
    }
    @Override
    public int insertSelective(Friendship friendship) {
        return friendshipMapper.insertSelective(friendship);
    }
    @Override
    public Friendship selectByPrimaryKey(Long fid) {
        return friendshipMapper.selectByPrimaryKey(fid);
    }
    @Override
    public int updateByPrimaryKeySelective(Friendship friendship) {
        return friendshipMapper.updateByPrimaryKeySelective(friendship);
    }
    @Override
    public int updateByPrimaryKey(Friendship friendship) {
        return friendshipMapper.updateByPrimaryKey(friendship);
    }
}