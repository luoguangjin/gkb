package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.pojo.User;

import java.time.LocalDate;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
public interface IUserService extends IService<User> {

    /**
     * 用户列表带分页
     * @param page
     * @param size
     * @param user
     * @param dateScope
     * @return
     */
    PageBean getUserByPage(Integer page, Integer size, User user, LocalDate[] dateScope);
}
