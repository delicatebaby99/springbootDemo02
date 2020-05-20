package com.tedu.springbootdemo02.mapper;

import com.tedu.springbootdemo02.pojo.Account;


/**
 * date:2020-05-16
 * author:zhangxiaoshuai
 */
public interface AccountMapper {

    Account selectAccountByUsername(String username);
}
