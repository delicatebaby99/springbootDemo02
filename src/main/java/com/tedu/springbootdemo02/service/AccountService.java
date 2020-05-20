package com.tedu.springbootdemo02.service;

import com.tedu.springbootdemo02.mapper.AccountMapper;
import com.tedu.springbootdemo02.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * date:2020-05-16
 * author:zhangxiaoshuai
 */
@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public Account selectAccountByUsername(String username){
        Account account=new Account();
        account.setLoginName(username);
        return this.accountMapper.selectAccountByUsername(username);
    }

}
