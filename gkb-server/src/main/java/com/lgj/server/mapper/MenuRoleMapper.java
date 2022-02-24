package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lgj.server.pojo.MenuRole;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {


    /**
     *@Description TODO
     * 更新角色菜单
     *@param
     *@return java.lang.Integer
     *@date 2022/2/3 0:25
     *@auther 24964
     */
    Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}
