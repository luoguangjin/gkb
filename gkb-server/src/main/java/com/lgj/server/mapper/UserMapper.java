package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lgj.server.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 用户列表带分页
     * @param pages
     * @param user
     * @param dateScope
     * @return
     */
    IPage<User> getUserByPage(Page<User> pages, @Param("user") User user,@Param("dateScope") LocalDate[] dateScope);
}
