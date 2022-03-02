package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lgj.server.pojo.Edulevel;
import org.apache.ibatis.annotations.Param;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
public interface EdulevelMapper extends BaseMapper<Edulevel> {

    /**
     * 高校性质带分页
     *
     * @param pages
     * @param edulevel
     * @return
     */
    IPage<Edulevel> getEdulevelPage(Page<Edulevel> pages, @Param("edulevel") Edulevel edulevel);

}