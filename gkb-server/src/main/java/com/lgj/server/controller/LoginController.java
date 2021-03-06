package com.lgj.server.controller;

import com.lgj.server.pojo.Admin;
import com.lgj.server.pojo.AdminLoginParam;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * @Classname 登录
 * @Description TODO
 * @Date 2022/1/24 15:25
 * @Created by 24964
 */
@Api(tags = "后台登录")
@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private IAdminService adminService;

    @ApiOperation(value = "登录之后返回token")
    @PostMapping("/login")
    public RespBean login(@RequestBody AdminLoginParam adminLoginParam, HttpServletRequest request){
        return adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword(),adminLoginParam.getCode(),request);
    }

    @ApiOperation(value = "获取当前用户的信息")
    @GetMapping("/admin/info")
    public Admin getAdminInfo(Principal principal){
        if(principal==null){
            return null;
        }
        String username = principal.getName();
        Admin admin = adminService.getAdminByUsername(username);
        admin.setPassword(null);
        admin.setRoles(adminService.getRoles(admin.getId()));
        return admin;
    }


    @ApiOperation(value = "退出登录")
    @PostMapping("/logout")
    public RespBean logout(){
        return RespBean.success("注销成功!");
    }
}
