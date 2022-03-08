package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.ExamTypeMapper;
import com.lgj.server.pojo.Batch;
import com.lgj.server.pojo.ExamType;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.service.IExamTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-08
 */
@Service
public class ExamTypeServiceImpl extends ServiceImpl<ExamTypeMapper, ExamType> implements IExamTypeService {

    @Autowired
    private ExamTypeMapper examTypeMapper;

    @Override
    public PageBean getExamTypeByPage(Integer page, Integer size, ExamType examType) {
        Page<ExamType> pages = new Page<>(page,size);
        IPage<ExamType> examTypeIPage = examTypeMapper.getExamTypeByPage(pages,examType);
        PageBean pageBean = new PageBean(examTypeIPage.getTotal(),examTypeIPage.getRecords());
        return pageBean;
    }
}
