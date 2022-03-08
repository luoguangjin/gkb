package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.College;
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
public interface ICollegeService extends IService<College> {

    /**
     * 学校信息带分页
     * @param page
     * @param size
     * @param college
     * @param colDate
     * @return
     */
    PageBean getCollegeByPage(Integer page, Integer size, College college, LocalDate[] colDate);
}
