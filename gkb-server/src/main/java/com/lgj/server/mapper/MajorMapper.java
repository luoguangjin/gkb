package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lgj.server.pojo.Major;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
public interface MajorMapper extends BaseMapper<Major> {

    List<Major> getAllMajors(Integer parentId);
}
