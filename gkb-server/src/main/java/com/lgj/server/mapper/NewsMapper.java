package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lgj.server.pojo.News;

import java.time.LocalDate;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
public interface NewsMapper extends BaseMapper<News> {

    /**
     * 获取所有新闻信息 带分页
     * @param pages
     * @param news
     * @param dateScope
     * @return
     */
    IPage<News> getUserByPage(Page<News> pages, News news, LocalDate[] dateScope);
}
