package com.service;

import com.entity.Comments;

import java.util.List;
import java.util.Map;

public interface ICommentsService {
    List select_commentsAll();
    List select_commentsMap(Map map);
    int deleteByPrimaryKey(Long cid);

    int insert(Comments comments);

    int insertSelective(Comments comments);

    Comments selectByPrimaryKey(Long cid);

    int updateByPrimaryKeySelective(Comments comments);

    int updateByPrimaryKey(Comments comments);
}
