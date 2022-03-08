package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.BatchMapper;
import com.lgj.server.pojo.Batch;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.pojo.User;
import com.lgj.server.service.IBatchService;
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
public class BatchServiceImpl extends ServiceImpl<BatchMapper, Batch> implements IBatchService {

    @Autowired
    private BatchMapper batchMapper;

    @Override
    public PageBean getBatchByPage(Integer page, Integer size, Batch batch) {
        Page<Batch> pages = new Page<>(page,size);
        IPage<Batch> batchIPage = batchMapper.getBatchByPage(pages,batch);
        PageBean pageBean = new PageBean(batchIPage.getTotal(),batchIPage.getRecords());
        return pageBean;
    }
}
