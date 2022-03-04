package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.Major;
import com.lgj.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
public interface IMajorService extends IService<Major> {

    /**
     * 获取所有专业信息
     * @return
     */
    List<Major> getAllMajors();

    /**
     * 添加专业信息
     * @param major
     * @return
     */
    RespBean addMajor(Major major);

    /**
     * 删除专业信息
     * @param id
     * @return
     */
    RespBean deleteMajor(Integer id);
}
