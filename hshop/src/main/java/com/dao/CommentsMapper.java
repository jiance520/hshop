package com.dao;

import com.entity.Comments;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CommentsMapper {
    List select_commentsAll();
    List select_commentsMap(Map map);
    int deleteByPrimaryKey(Long commentid);

    int insert(Comments record);

    int insertSelective(Comments record);

    Comments selectByPrimaryKey(Long commentid);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);
}