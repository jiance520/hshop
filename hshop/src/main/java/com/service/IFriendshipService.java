package com.service;

import com.entity.Friendship;

import java.util.List;
import java.util.Map;

public interface IFriendshipService {
    List select_friendshipAll();
    List select_friendshipMap(Map map);
    int deleteByPrimaryKey(Long fid);

    int insert(Friendship friendship);

    int insertSelective(Friendship friendship);

    Friendship selectByPrimaryKey(Long fid);

    int updateByPrimaryKeySelective(Friendship friendship);

    int updateByPrimaryKey(Friendship friendship);
}
