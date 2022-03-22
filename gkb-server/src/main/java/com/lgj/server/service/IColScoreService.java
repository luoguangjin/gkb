package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.ColScore;
import com.lgj.server.pojo.PageBean;

import java.time.LocalDate;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-08
 */
public interface IColScoreService extends IService<ColScore> {

    /**
     * 获取高校分数线带分页
     * @param page
     * @param size
     * @param colScore
     * @param years
     * @return
     */
    PageBean getColScoreByPage(Integer page, Integer size, ColScore colScore, LocalDate[] years);
}
