package com.zach.shardingspheretest.controller;

import com.zach.shardingspheretest.entity.UserEntity;
import com.zach.shardingspheretest.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @Resource
    private UserMapper userMapper;

    @PostMapping("save")
    public String save(@RequestBody UserEntity user){
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>{}",user.toString());
        userMapper.insert(user);
        return "成功";
    }
    @PostMapping("find")
    public String find(@RequestBody Long id){
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>{}",id.toString());
        return userMapper.selectByUserId(id).toString();
    }
}
