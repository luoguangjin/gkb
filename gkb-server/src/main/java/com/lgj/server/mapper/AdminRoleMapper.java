package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lgj.server.pojo.AdminRole;
import com.lgj.server.pojo.RespBean;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    /**
     *@Description TODO
     * 更新系统操作员角色
     *@return com.lgj.server.pojo.RespBean
     *@date 2022/2/20 1:01
     *@auther 24964
     */
    Integer updateAdminRole(Integer adminId, Integer[] rids);
}
