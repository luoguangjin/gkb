package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.ExamType;
import com.lgj.server.pojo.PageBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-08
 */
public interface IExamTypeService extends IService<ExamType> {

    /**
     * 获取考生类别带分页
     * @param page
     * @param size
     * @param examType
     * @return
     */
    PageBean getExamTypeByPage(Integer page, Integer size, ExamType examType);
}
