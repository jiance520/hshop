package com.service;

import com.entity.Grade;

import java.util.List;
import java.util.Map;

public interface IGradeService {
    List select_gradeAll();
    List select_gradeMap(Map map);
    int deleteByPrimaryKey(Long gid);

    int insert(Grade grade);

    int insertSelective(Grade grade);

    Grade selectByPrimaryKey(Long gid);

    int updateByPrimaryKeySelective(Grade grade);

    int updateByPrimaryKey(Grade grade);
}
