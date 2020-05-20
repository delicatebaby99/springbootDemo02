package com.tedu.springbootdemo02.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * date:2020-05-16
 * author:zhangxiaoshuai
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer accountId;
    private Integer recommenderId;
    private String loginName;
    private String LoginPasswd;
    private String status;
    private Date createDate;
    private Date pauseDate;
    private Date closeDate;
    private String realName;
    private String idcardNo;
    private Date birthdate;
    private String gender;
    private String occupation;
    private String telephone;
    private String email;
    private String mailaddress;
    private String zipcode;
    private String qq;
    private Date lastLoginTime;
    private String lastLoginIp;
}