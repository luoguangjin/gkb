package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lgj.server.pojo.College;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
public interface CollegeMapper extends BaseMapper<College> {

    /**
     * 学校信息带分页
     * @param pages
     * @param college
     * @param colDate
     * @return
     */
    IPage<College> getCollegeByPage(Page<College> pages, @Param("college") College college, @Param("colDate") LocalDate[] colDate);

    /**
     * 根据id查询数据详情
     * @param id
     * @return
     */
    College selectByOne(Integer id);
}
