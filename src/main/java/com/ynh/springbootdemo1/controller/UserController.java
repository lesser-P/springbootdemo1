package com.ynh.springbootdemo1.controller;

import com.ynh.springbootdemo1.dao.UserMapper;
import com.ynh.springbootdemo1.dao.impl.UserMapperImpl;
import com.ynh.springbootdemo1.domain.Result;
import com.ynh.springbootdemo1.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserMapperImpl userMapper;

    @GetMapping("/getall")
    public Result getall(){
        List<User> users = userMapper.selectAll();
        Result result = new Result();
        result.setData(users);
        result.setSucess(true);
        return result;
    }
    @GetMapping("/getid/{userid}")
    public Result getById(@PathVariable int userid){
        User user = userMapper.selectbyid(userid);
        Result result = new Result();
        result.setData(user);
        result.setMessage("success");
        result.setSucess(true);
        return result;
    }

    @GetMapping("/{username}")
    public Result findall(@PathVariable String username){
        List<User> users = userMapper.getall(username);
        Result result = new Result();
        result.setData(users);
        result.setSucess(true);
        return result;
    }

}
