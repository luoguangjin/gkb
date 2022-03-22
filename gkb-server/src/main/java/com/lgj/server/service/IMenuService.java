package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
public interface IMenuService extends IService<Menu> {

    /**
     *@Description TODO
     *通过用户id查询
     *@param
     *@return java.util.List<com.lgj.server.pojo.Menu>
     *@date 2022/1/26 0:31
     *@auther 24964
     */
    List<Menu> getMenusByAdminId();

    /**
     *@Description TODO
     * 根据角色获取菜单列表
     *@param
     *@return java.util.List<com.lgj.server.pojo.Menu>
     *@date 2022/1/27 1:15
     *@auther 24964
     */
    List<Menu> getMenusWithRole();

    /**
     *@Description TODO
     * 查询所有菜单
     *@param
     *@return java.util.List<com.lgj.server.pojo.Menu>
     *@date 2022/2/2 20:46
     *@auther 24964
     */
    List<Menu> getAllMenus();

}
