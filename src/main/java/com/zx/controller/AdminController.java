package com.zx.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zx.domain.TAdmin;
import com.zx.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/AdminController")
public class AdminController {

    @Autowired
    private TAdminService tAdminService;

    @RequestMapping("/adminLogin")
    @ResponseBody
    public boolean adminLogin(String aname, String apwd, HttpSession session){
        QueryWrapper<TAdmin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("aname",aname).eq("apwd",apwd);

        // 通过mybatisPlus获得查询到的对象
        TAdmin user = tAdminService.getOne(queryWrapper);

        if (user==null){
            return false;
        }else{
            //将用户信息保存到session中
            session.setAttribute("user", user);

            return true;
        }
    }
}
