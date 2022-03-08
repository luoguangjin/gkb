package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.Batch;
import com.lgj.server.pojo.PageBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-08
 */
public interface IBatchService extends IService<Batch> {

    /**
     * 获取批次信息带分页
     * @param page
     * @param size
     * @param batch
     * @return
     */
    PageBean getBatchByPage(Integer page, Integer size, Batch batch);
}
