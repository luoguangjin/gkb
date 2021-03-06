package com.lgj.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lgj.server.pojo.Column;
import com.lgj.server.pojo.Major;
import com.lgj.server.pojo.RespBean;

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

    /**
     * 添加专业信息
     * @param major
     */
    RespBean addMajor(Major major);

    /**
     * 删除专业信息
     * @param major
     * @return
     */
    RespBean deleteMajor(Major major);

    /**
     * 根据学校id获取专业信息
     * @return
     */
    List<Major> getMajorsByCollegeId(Integer id);

    /**
     * 通过父id查询专业小类
     * @param pid
     * @return
     */
    List<Major> getMajorsByParentId(Integer pid);
}
