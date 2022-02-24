package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lgj.server.pojo.Admin;
import com.lgj.server.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
public interface AdminMapper extends BaseMapper<Admin> {


    /**
     *@Description TODO
     * 获取所有操作员信息
     *@param
     *@return java.util.List<com.lgj.server.pojo.Admin>
     *@date 2022/2/19 17:55
     *@auther 24964
     */
    List<Admin> getAllAdmin(@Param("id") Integer id,@Param("keyword") String keyword);
}
