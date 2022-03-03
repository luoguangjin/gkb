package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.News;
import com.lgj.server.pojo.PageBean;

import java.time.LocalDate;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
public interface INewsService extends IService<News> {

    /**
     * 新闻数据带分页
     * @param page
     * @param size
     * @param news
     * @param createTime
     * @return
     */
    PageBean getNewsByPage(Integer page, Integer size, News news, LocalDate[] createTime);
}
