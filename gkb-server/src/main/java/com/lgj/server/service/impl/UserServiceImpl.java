package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.UserMapper;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.pojo.User;
import com.lgj.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户列表带分页
     * @param page
     * @param size
     * @param user
     * @param dateScope
     * @return
     */
    @Override
    public PageBean getUserByPage(Integer page, Integer size, User user, LocalDate[] dateScope) {
        Page<User> pages = new Page<>(page,size);
        IPage<User> userIPage = userMapper.getUserByPage(pages,user,dateScope);
        PageBean pageBean = new PageBean(userIPage.getTotal(),userIPage.getRecords());
        return pageBean;
    }
}
