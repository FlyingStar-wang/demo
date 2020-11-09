package com.wx.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: demo
 * @description: 用户实体类
 * @author: Mr.Wang
 * @create: 2020-11-08 23:20
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 用户id
     */
    private String id;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户性别：0是男，1是女
     */
    private Integer sex;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 用户地址
     */
    private String address;
}
