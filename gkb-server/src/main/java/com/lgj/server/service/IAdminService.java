package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.Admin;
import com.lgj.server.pojo.Menu;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 登录返回
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password,String code, HttpServletRequest request);

    /**
     * 获取当前用户信息
     * @param username
     * @return
     */
    Admin getAdminByUsername(String username);

    /**
     *@Description TODO 根据用户id查询角色列表
     *@param adminId
     *@return java.util.List<com.lgj.server.pojo.Role>
     *@date 2022/1/28 0:12
     *@auther 24964
     */
    List<Role> getRoles(Integer adminId);


    /**
     *@Description TODO
     * 获取所有操作员信息
     *@param
     *@return java.util.List<com.lgj.server.pojo.Admin>
     *@date 2022/2/19 17:55
     *@auther 24964
     */
    List<Admin> getAllAdmins(String keyword);

    /**
     *@Description TODO
     * 更新系统操作员角色
     *@return com.lgj.server.pojo.RespBean
     *@date 2022/2/20 1:01
     *@auther 24964
     */
    RespBean updateAdminRole(Integer adminId, Integer[] rids);
}
