package com.ynh.springbootdemo1.dao;

import com.ynh.springbootdemo1.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    public List<User> selectAll();

    public User selectbyid(int userid);

    public List<User> getall(String username);

    public User selectbyemial(String emial);

}
