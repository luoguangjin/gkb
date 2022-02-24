package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.AdminMapper;
import com.lgj.server.mapper.MenuMapper;
import com.lgj.server.pojo.Admin;
import com.lgj.server.pojo.Menu;
import com.lgj.server.service.IMenuService;
import com.lgj.server.utils.AdminUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
    @Autowired
    private MenuMapper menuMapper;
    /**
     *@Description TODO
     *通过用户id查询
     *@param
     *@return java.util.List<com.lgj.server.pojo.Menu>
     *@date 2022/1/26 0:31
     *@auther 24964
     */
    @Override
    public List<Menu> getMenusByAdminId() {
        return menuMapper.getMenusByAdminId(AdminUtils.getCurrenAdmin().getId());
    }

    /**
     *@Description TODO
     * 根据角色获取菜单列表
     *@param
     *@return java.util.List<com.lgj.server.pojo.Menu>
     *@date 2022/1/27 1:15
     *@auther 24964
     */
    @Override
    public List<Menu> getMenusWithRole() {
        return menuMapper.getMenusWithRole();
    }

    /**
     *@Description TODO
     * 查询所有菜单
     *@param
     *@return java.util.List<com.lgj.server.pojo.Menu>
     *@date 2022/2/2 20:46
     *@auther 24964
     */
    @Override
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }
}
