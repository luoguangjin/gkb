package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lgj.server.pojo.ColScore;

import java.time.LocalDate;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-08
 */
public interface ColScoreMapper extends BaseMapper<ColScore> {

    /**
     * 获取高校分数线带分页
     * @param pages
     * @param colScore
     * @param years
     * @return
     */
    IPage<ColScore> getColScoreByPage(Page<ColScore> pages, ColScore colScore, LocalDate[] years);
}
