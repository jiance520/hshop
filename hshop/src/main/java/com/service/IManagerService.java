package com.service;

import java.util.*;
import com.entity.*;

public interface IManagerService {
    Manager selectLogin(Map map);
    List selectAll();
    List select_managerMap(Map map);
    int deleteByPrimaryKey(Long mid);

    int insert(Manager manager);

    int insertSelective(Manager manager);

    Manager selectByPrimaryKey(Long mid);

    int updateByPrimaryKeySelective(Manager manager);

    int updateByPrimaryKey(Manager manager);
}
