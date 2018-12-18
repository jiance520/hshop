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
@Service("gradeService")
public class GradeService implements  IGradeService{
    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public List select_gradeAll() {
        return gradeMapper.select_gradeAll();
    }

    @Override
    public List select_gradeMap(Map map) {
        return gradeMapper.select_gradeMap(map);
    }

    @Override
    public int deleteByPrimaryKey(Long gid) {

        return gradeMapper.deleteByPrimaryKey(gid);
    }
    @Override
    public int insert(Grade grade) {

        return gradeMapper.insert(grade);
    }
    @Override
    public int insertSelective(Grade grade) {
        return gradeMapper.insertSelective(grade);
    }
    @Override
    public Grade selectByPrimaryKey(Long gid) {
        return gradeMapper.selectByPrimaryKey(gid);
    }
    @Override
    public int updateByPrimaryKeySelective(Grade grade) {
        return gradeMapper.updateByPrimaryKeySelective(grade);
    }
    @Override
    public int updateByPrimaryKey(Grade grade) {
        return gradeMapper.updateByPrimaryKey(grade);
    }
}