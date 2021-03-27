package com.team.ms.dao;

import com.team.ms.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    public void insertUser(User user);
    public void updateUser(User user);
    public List<User> selectUsers();
    public User selectUserById(String uid);
    public void deleteUser(String uid);

}
