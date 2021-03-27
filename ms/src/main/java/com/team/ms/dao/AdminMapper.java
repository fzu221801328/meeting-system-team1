package com.team.ms.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface AdminMapper {

    //添加分论坛主席
    public void addSubForumChairman(Map<String,String> map);
    
}
