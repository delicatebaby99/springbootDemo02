package com.tedu.springbootdemo02.service;

import com.github.pagehelper.PageHelper;
import com.tedu.springbootdemo02.mapper.AdminMapper;
import com.tedu.springbootdemo02.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * date:2020-05-17
 * author:zhangxiaoshuai
 */
@Service
public class AdminService{
    @Autowired
    private AdminMapper adminMapper;

    public List<Admin> findAllAdmin(Integer page,Integer size) {
        PageHelper.startPage(page,size);
        return this.adminMapper.findAllAdmin();
    }

    public Admin findAdmin(Integer id) {
        return this.adminMapper.findAdmin(id);
    }
}
