package com.lgj.server.controller;


import com.lgj.server.pojo.Menu;
import com.lgj.server.service.IAdminService;
import com.lgj.server.service.IMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
@Api(tags = "菜单管理")
@RestController
@RequestMapping("/system/cfg/")
public class MenuController {

    @Autowired
    private IMenuService menuService;


    @ApiOperation(value = "通过用户id查询菜单列表")
    @GetMapping("/menu")
    public List<Menu> getMenusByAdminId(){
        return menuService.getMenusByAdminId();
    }

}
