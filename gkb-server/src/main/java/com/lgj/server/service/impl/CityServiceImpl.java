package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.CityMapper;
import com.lgj.server.pojo.City;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.pojo.User;
import com.lgj.server.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-02-01
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public PageBean getCityByPage(Integer page, Integer size, City city) {
        Page<City> pages = new Page<>(page,size);
        IPage<City> cityIPage = cityMapper.getCityByPage(pages,city);
        PageBean pageBean = new PageBean(cityIPage.getTotal(),cityIPage.getRecords());
        return pageBean;
    }
}
