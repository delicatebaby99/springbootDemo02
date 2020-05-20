package com.tedu.springbootdemo02.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * date:2020-05-17
 * author:zhangxiaoshuai
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "admin_info")
public class Admin {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer adminId;
    private String adminCode;
    private String password;
    private String name;
    private String telephone;



}
