package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.NewsMapper;
import com.lgj.server.pojo.News;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.pojo.User;
import com.lgj.server.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {


    @Autowired
    private NewsMapper newsMapper;

    /**
     * 获取所有新闻信息带分页
     * @param page
     * @param size
     * @param news
     * @param dateScope
     * @return
     */
    @Override
    public PageBean getNewByPage(Integer page, Integer size, News news, LocalDate[] dateScope) {
        Page<News> pages = new Page<>(page,size);
        IPage<News> newsIPage = newsMapper.getUserByPage(pages,news,dateScope);
        PageBean pageBean = new PageBean(newsIPage.getTotal(),newsIPage.getRecords());
        return pageBean;
    }
}
