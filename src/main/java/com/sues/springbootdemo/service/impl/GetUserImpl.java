package com.sues.springbootdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sues.springbootdemo.entity.User;
import com.sues.springbootdemo.mapper.UserMapper;
import com.sues.springbootdemo.service.GetUser;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author Alan
 * @date 2022/11/19 12:24
 **/
@Service
public class GetUserImpl extends ServiceImpl<UserMapper, User> implements GetUser {


    @Override
    public User getByIdadd1(Integer id) {
        return getById(id+1);
    }
}
