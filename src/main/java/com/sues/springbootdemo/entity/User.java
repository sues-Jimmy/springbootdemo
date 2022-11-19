package com.sues.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author Alan
 * @date 2022/11/19 12:14
 **/

@TableName("pratice1")
@Data
public class User {
    private int id;
    private String name;
}
