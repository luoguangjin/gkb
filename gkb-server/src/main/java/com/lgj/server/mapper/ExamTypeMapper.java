package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lgj.server.pojo.Batch;
import com.lgj.server.pojo.ExamType;
import com.lgj.server.pojo.PageBean;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-08
 */
public interface ExamTypeMapper extends BaseMapper<ExamType> {

    /**
     * 获取考生类别带分页
     * @param pages
     * @param examType
     * @return
     */
    IPage<ExamType> getExamTypeByPage(Page<ExamType> pages, @Param("examType") ExamType examType);
}
