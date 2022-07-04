package com.ynh.springbootdemo1.dao.impl;

import com.ynh.springbootdemo1.dao.UserMapper;
import com.ynh.springbootdemo1.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMapperImpl implements UserMapper {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    @Override
    public User selectbyid(int userid) {
        User selectbyid = userMapper.selectbyid(userid);
        return selectbyid;
    }

    @Override
    public List<User> getall(String username) {
        return userMapper.getall(username);
    }

}
