package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lgj.server.pojo.Role;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     *@Description TODO 根据用户id查询角色列表
     *@param adminId
     *@return java.util.List<com.lgj.server.pojo.Role>
     *@date 2022/1/28 0:12
     *@auther 24964
     */
    List<Role> getRoles(Integer adminId);
}
