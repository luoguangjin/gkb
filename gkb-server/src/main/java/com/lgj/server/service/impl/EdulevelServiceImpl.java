package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.EdulevelMapper;
import com.lgj.server.pojo.Edulevel;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.service.IEdulevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
@Service
public class EdulevelServiceImpl extends ServiceImpl<EdulevelMapper, Edulevel> implements IEdulevelService {

    @Autowired
    private EdulevelMapper edulevelMapper;

    /**
     * 高校性质带分页
     * @param page
     * @param size
     * @param edulevel
     * @return
     */
    @Override
    public PageBean getEdulevelPage(Integer page, Integer size, Edulevel edulevel) {
        Page<Edulevel> pages = new Page<>(page,size);
        IPage<Edulevel> edulevelIPage = edulevelMapper.getEdulevelPage(pages,edulevel);
        PageBean pageBean = new PageBean(edulevelIPage.getTotal(),edulevelIPage.getRecords());
        return pageBean;
    }


}
