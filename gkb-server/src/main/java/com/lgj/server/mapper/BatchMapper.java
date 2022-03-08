package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lgj.server.pojo.Batch;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-08
 */
public interface BatchMapper extends BaseMapper<Batch> {

    /**
     * 获取批次信息带分页
     * @param pages
     * @param batch
     * @return
     */
    IPage<Batch> getBatchByPage(Page<Batch> pages,@Param("batch") Batch batch);
}
