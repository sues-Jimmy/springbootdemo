package com.sues.springbootdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sues.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Alan
 * @date 2022/11/19 12:22
 **/

@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> selectAllById(@Param("id") Integer id);
}
