package com.lgj.server.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lgj.server.pojo.Menu;
import com.lgj.server.pojo.MenuRole;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.pojo.Role;
import com.lgj.server.service.IMenuRoleService;
import com.lgj.server.service.IMenuService;
import com.lgj.server.service.IRoleService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Classname PermissionController
 * @Description TODO 权限组
 * @Date 2022/2/1 23:52
 * @Created by 24964
 */
@RestController
@RequestMapping("/system/basic/permiss")
public class PermissController {

    @Autowired
    private IRoleService roleService;
    @Autowired
    private IMenuService menuService;
    @Autowired
    private IMenuRoleService menuRoleService;

    @ApiOperation(value = "获取所有角色信息")
    @GetMapping("/")
    public List<Role> getAllRoles(){
        return roleService.list();
    }

    @ApiOperation(value = "添加角色信息")
    @PostMapping("/role")
    public RespBean addRole(@RequestBody Role role){
        if(role.getName().startsWith("ROLE_")){
            role.setName("ROLE_"+role.getName());
        }
        if (roleService.save(role)){
            return RespBean.success("添加成功！！");
        }
        return RespBean.error("添加失败！！");
    }

    @ApiOperation(value = "删除角色信息")
    @DeleteMapping("/role/{rid}")
    public RespBean deleteRole(@PathVariable Integer rid){
        if(roleService.removeById(rid)){
            return RespBean.success("删除成功！！");
        }
        return RespBean.error("删除失败！");
    }

    @ApiOperation(value = "查询所有菜单")
    @GetMapping("/menus")
    public List<Menu> getAllMenus(){
        return menuService.getAllMenus();
    }

    @ApiOperation(value = "根据角色id查询菜单id")
    @GetMapping("/mid/{rid}")
    public List<Integer> getMidByrId(@PathVariable Integer rid){
        return menuRoleService.list(new QueryWrapper<MenuRole>().eq("rid",rid)).stream().map
                (MenuRole::getMid).collect(Collectors.toList());
    }

    @ApiOperation(value = "更新角色菜单")
    @PutMapping("/")
    public RespBean updateMenuRole(Integer rid,Integer[] ids){
        return menuRoleService.updateMenuRole(rid,ids);
    }

}
