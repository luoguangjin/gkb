package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.MajorScoreMapper;
import com.lgj.server.pojo.MajorScore;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.service.IMajorScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-08
 */
@Service
public class MajorScoreServiceImpl extends ServiceImpl<MajorScoreMapper, MajorScore> implements IMajorScoreService {

    @Autowired
    private MajorScoreMapper majorScoreMapper;

    @Override
    public PageBean getMajorScoreByPage(Integer page, Integer size, MajorScore majorScore, LocalDate[] years) {
        Page<MajorScore> pages = new Page<>(page,size);
        IPage<MajorScore> majorScoreIPage = majorScoreMapper.getMajorScoreByPage(pages,majorScore,years);
        PageBean pageBean = new PageBean(majorScoreIPage.getTotal(),majorScoreIPage.getRecords());
        return pageBean;
    }
}
