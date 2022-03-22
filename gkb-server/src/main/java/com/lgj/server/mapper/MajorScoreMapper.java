package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lgj.server.pojo.MajorScore;

import java.time.LocalDate;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-08
 */
public interface MajorScoreMapper extends BaseMapper<MajorScore> {

    /**
     * 获取专业分数线带分页
     * @param pages
     * @param majorScore
     * @param years
     * @return
     */
    IPage<MajorScore> getMajorScoreByPage(Page<MajorScore> pages, MajorScore majorScore, LocalDate[] years);
}
