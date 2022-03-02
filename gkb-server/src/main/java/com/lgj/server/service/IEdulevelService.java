package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.Edulevel;
import com.lgj.server.pojo.PageBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
public interface IEdulevelService extends IService<Edulevel> {

    /**
     * 高校性质带分页
     * @param page
     * @param size
     * @param edulevel
     * @return
     */
    PageBean getEdulevelPage(Integer page, Integer size, Edulevel edulevel);
}
