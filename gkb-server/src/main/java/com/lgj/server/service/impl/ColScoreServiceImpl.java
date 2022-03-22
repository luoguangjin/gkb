package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.ColScoreMapper;
import com.lgj.server.pojo.ColScore;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.pojo.User;
import com.lgj.server.service.IColScoreService;
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
public class ColScoreServiceImpl extends ServiceImpl<ColScoreMapper, ColScore> implements IColScoreService {

    @Autowired
    private ColScoreMapper colScoreMapper;

    @Override
    public PageBean getColScoreByPage(Integer page, Integer size, ColScore colScore, LocalDate[] years) {
        Page<ColScore> pages = new Page<>(page,size);
        IPage<ColScore> colScoreIPage = colScoreMapper.getColScoreByPage(pages,colScore,years);
        PageBean pageBean = new PageBean(colScoreIPage.getTotal(),colScoreIPage.getRecords());
        return pageBean;
    }
}
