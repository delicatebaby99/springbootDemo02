package com.tedu.springbootdemo02.controller;


import com.github.pagehelper.PageInfo;
import com.tedu.springbootdemo02.pojo.Admin;
import com.tedu.springbootdemo02.service.AdminService;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;


/**
 * date:2020-05-17
 * author:zhangxiaoshuai
 */
@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    private static final Logger log = LoggerFactory.getLogger(AdminController.class);

//    获取所有管理员

    @GetMapping("/Admins/{page}")
    public String findAllAdmin(@PathVariable("page")Integer page, @RequestParam(defaultValue = "3")Integer size,
                               Model model) {
        log.info("查询了所有管理员");

        List<Admin> AdminList = adminService.findAllAdmin(page, size);

        PageInfo pageInfo = new PageInfo(AdminList);

        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("name", "divided");
        return "admin/admin_list";
    }

//    跳转到管理员修改界面,查询管理员信息，页面回显

    @GetMapping("/admin/{id}")
    public String toAdminEdit(@PathVariable("id") Integer id,Model model){
        log.debug("跳转到管理员修改界面");
        Admin amdin= this.adminService.findAdmin(id);
        model.addAttribute("admin",amdin);
        return "admin/admin_modi";
    }

//    跳转到添加管理员界面

    @GetMapping("/admin")
    public String toAdminAdd(){
        log.debug("跳转到管理员添加界面");
        return "admin/admin_add";
    }

//    添加管理员

    @PostMapping("/admin")
    public String addAdmin(Admin admin){
        System.out.println(admin);
        log.debug("正在添加管理员信息。。。");


        return "redirect:/Admins/1";
    }






    @PutMapping("/admin/{id}")
    public String updateAdminById(Integer adminId, Model model) {


        log.info("修改管理员信息");
//        this.adminService.updateAdminById();

        return "";
    }


}
