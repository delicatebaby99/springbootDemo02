package com.tedu.springbootdemo02.mapper;

import com.tedu.springbootdemo02.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * date:2020-05-17
 * author:zhangxiaoshuai
 */
public interface AdminMapper {

    List<Admin> findAllAdmin();

    Admin findAdmin(@Param("adminId") Integer id);

}
