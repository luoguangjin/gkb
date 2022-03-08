package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.CollegeMapper;
import com.lgj.server.pojo.College;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.service.ICollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
@Service
public class CollegeServiceImpl extends ServiceImpl<CollegeMapper, College> implements ICollegeService {

    @Autowired
    private CollegeMapper collegeMapper;

    @Override
    public PageBean getCollegeByPage(Integer page, Integer size, College college, LocalDate[] colDate) {
        Page<College> pages = new Page<>(page,size);
        IPage<College> collegeIPage = collegeMapper.getCollegeByPage(pages,college,colDate);
        PageBean pageBean = new PageBean(collegeIPage.getTotal(),collegeIPage.getRecords());
        return pageBean;
    }
}
