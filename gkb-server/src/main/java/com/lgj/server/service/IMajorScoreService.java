package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.MajorScore;
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
public interface IMajorScoreService extends IService<MajorScore> {

    /**
     * 获取专业分数线带分页
     * @param page
     * @param size
     * @param majorScore
     * @param years
     * @return
     */
    PageBean getMajorScoreByPage(Integer page, Integer size, MajorScore majorScore, LocalDate[] years);
}
