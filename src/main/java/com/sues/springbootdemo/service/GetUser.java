package com.sues.springbootdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sues.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Alan
 * @date 2022/11/19 12:23
 **/

public interface GetUser extends IService<User> {
    User getByIdadd1(Integer id);
}
