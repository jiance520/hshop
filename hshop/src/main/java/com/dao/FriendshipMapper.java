package com.dao;

import com.entity.Friendship;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface FriendshipMapper {
    List select_friendshipAll();
    List select_friendshipMap(Map map);
    int deleteByPrimaryKey(Long fid);

    int insert(Friendship record);

    int insertSelective(Friendship record);

    Friendship selectByPrimaryKey(Long fid);

    int updateByPrimaryKeySelective(Friendship record);

    int updateByPrimaryKey(Friendship record);
}