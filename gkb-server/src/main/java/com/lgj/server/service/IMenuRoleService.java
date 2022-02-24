package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.MenuRole;
import com.lgj.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     *@Description TODO
     * 更新角色菜单
     *@param
     *@return com.lgj.server.pojo.RespBean
     *@date 2022/2/3 0:18
     *@auther 24964
     */
    RespBean updateMenuRole(Integer rid, Integer[] ids);
}
