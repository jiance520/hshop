package com.dao;

import com.entity.Orderstate;
import com.entity.Sellorder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SellorderMapper {
    List selectAll();
    List selectSellOrderMapSearchAll(Map map);
    List<Sellorder> selectByStateId(Long orderstateid);
    int deleteByPrimaryKey(Long soid);

    int insert(Sellorder record);

    int insertSelective(Sellorder record);

    Sellorder selectByPrimaryKey(Long soid);

    int updateByPrimaryKeySelective(Sellorder record);

    int updateByPrimaryKey(Sellorder record);
}