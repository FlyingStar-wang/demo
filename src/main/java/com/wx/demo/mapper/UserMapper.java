package com.wx.demo.mapper;

import com.wx.demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: demo
 * @description: 用户数据接口
 * @author: Mr.Wang
 * @create: 2020-11-08 23:18
 **/
@Repository
public interface UserMapper {

    /**
     * 查询全部用户
     * @return
     */
    List<User> queryAll();
}
