package com.lgj.server.controller;


import com.lgj.server.pojo.Admin;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.pojo.Role;
import com.lgj.server.service.IAdminService;
import com.lgj.server.service.IRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IAdminService adminService;
    @Autowired
    private IRoleService roleService;

    @ApiOperation(value = "获取所有系统操作人员")
    @GetMapping("/")
    public List<Admin> getAllAdmins(String keyword){
        return adminService.getAllAdmins(keyword);
    }

    @ApiOperation(value = "更新系统人员")
    @PutMapping("/")
    public RespBean updateAdmin(@RequestBody Admin admin){
        if (adminService.updateById(admin)){
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }

    @ApiOperation(value = "删除系统人员")
    @DeleteMapping("/{id}")
    public RespBean deleteAdmin(@PathVariable Integer id){
        if(adminService.removeById(id)){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @ApiOperation(value = "获取所有角色")
    @GetMapping("/role")
    public List<Role> getAllRole(){
        return roleService.list();
    }

    @ApiOperation(value = "更新操作人角色")
    @PutMapping("/role")
    public RespBean updateAdminRole(Integer adminId,Integer[] rids){
        return adminService.updateAdminRole(adminId,rids);
    }


}
