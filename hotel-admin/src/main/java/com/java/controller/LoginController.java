package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("")
    public   String login(String username,String pwd){
//        1.接受用户名密码，并且效验数据的合理性
//        2.当登录成功时，需要获取当前用户的id，获取完成后得到当前用户的权限
//        3.跳转到inex.jsp页面，将权限信息封装到model中
        return "index.jsp";


    }
}