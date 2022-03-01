package com.lgj.server.controller;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.pojo.User;
import com.lgj.server.service.IUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
@RestController
@RequestMapping("/user/basic")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "用户数据")
    @GetMapping("/")
    public PageBean getUser(@RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "10") Integer size, User user,
                            LocalDate[] dateScope){//dateScope用来接收时间

        return userService.getUserByPage(page,size,user,dateScope);
    }

    @ApiOperation(value = "添加用户信息")
    @PostMapping("/")
    public RespBean addUser(@RequestBody User user){
        if(userService.save(user)){
            return RespBean.success("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @ApiOperation(value = "更新用户信息")
    @PutMapping("/")
    public RespBean updateUser(@RequestBody User user){
        if(userService.updateById(user)){
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }

    @ApiOperation(value = "删除用户信息")
    @DeleteMapping("/{id}")
    public RespBean deleteUser(@PathVariable Integer id){
        if(userService.removeById(id)){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @ApiOperation(value = "批量删除用户信息")
    @DeleteMapping("/")
    public RespBean deleteUserByIds(Integer[] ids){
        if(userService.removeByIds(Arrays.asList(ids))){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

}
