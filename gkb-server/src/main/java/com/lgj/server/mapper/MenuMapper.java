package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lgj.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     *@Description TODO
     * 通过id查询菜单列表
     *@param
     *@return java.util.List<com.lgj.server.pojo.Menu>
     *@date 2022/1/26 0:38
     *@auther 24964
     */
    List<Menu> getMenusByAdminId(Integer id);

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
