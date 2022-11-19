package com.sues.springbootdemo.controller;
import com.sues.springbootdemo.entity.User;
import com.sues.springbootdemo.mapper.UserMapper;
import com.sues.springbootdemo.service.GetUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Alan
 * @date 2022/11/19 12:26
 **/
//@Controller
//@ResponseBody
@RestController
@RequestMapping("/pratice")
public class Pratice {

    @Resource
    private UserMapper userMapper;

    @Resource
    private GetUser getUser;


    @GetMapping("/getUser")
    public List<User> getUser(Integer id){
        return userMapper.selectAllById(id);
    }
}
