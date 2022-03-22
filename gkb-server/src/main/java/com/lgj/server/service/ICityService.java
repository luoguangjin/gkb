package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.City;
import com.lgj.server.pojo.PageBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-02-01
 */
public interface ICityService extends IService<City> {

    /**
     * 带分页的查询
     * @param page
     * @param size
     * @param city
     * @return
     */
    PageBean getCityByPage(Integer page, Integer size, City city);
}
