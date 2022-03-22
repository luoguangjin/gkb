package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lgj.server.pojo.City;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-02-01
 */
public interface CityMapper extends BaseMapper<City> {

    /**
     * 查询城市信息带分页
     * @param pages
     * @param city
     * @return
     */
    IPage<City> getCityByPage(Page<City> pages, @Param("city")City city);
}
