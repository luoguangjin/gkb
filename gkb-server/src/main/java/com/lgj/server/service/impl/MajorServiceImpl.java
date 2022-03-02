package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.MajorMapper;
import com.lgj.server.pojo.Major;
import com.lgj.server.service.IMajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
@Service
public class MajorServiceImpl extends ServiceImpl<MajorMapper, Major> implements IMajorService {

    @Autowired
    private MajorMapper majorMapper;

    @Override
    public List<Major> getAllMajors() {
        return majorMapper.getAllMajors(-1);
    }
}
