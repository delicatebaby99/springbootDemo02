package com.tedu.springbootdemo02.controller;

import com.tedu.springbootdemo02.pojo.Account;
import com.tedu.springbootdemo02.service.AccountService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * date:2020-05-16
 * author:zhangxiaoshuai
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;


    @PostMapping("/doLogin")
    @ResponseBody
    public String doLogin(String username, String password, HttpSession session) {
        System.out.println(username);
        System.out.println(password);
        JSONObject jsonObject = new JSONObject();
        Account account = accountService.selectAccountByUsername(username);
        System.out.println(account);
        if (account==null){
            System.out.println("用户不存在");
            jsonObject.put("result", "0");
        }else if (account.getLoginPasswd().equals(password)) {
            System.out.println("登录成功");
            session.setAttribute("account", account);
            jsonObject.put("result", "1");

        } else {
            System.out.println("登录失败");

            jsonObject.put("result", "2");

        }
        return jsonObject.toString();

    }


}
