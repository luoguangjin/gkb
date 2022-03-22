package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.MajorMapper;
import com.lgj.server.pojo.College;
import com.lgj.server.pojo.Column;
import com.lgj.server.pojo.Major;
import com.lgj.server.pojo.RespBean;
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

    @Override
    public RespBean addMajor(Major major) {
        major.setEnabled(true);
        majorMapper.addMajor(major);
        System.out.println(major.getResult());
        if (major.getResult()==1){
            return RespBean.success("添加成功",major);
        }
        return RespBean.error("添加失败");
    }

    @Override
    public RespBean deleteMajor(Integer id) {
        Major major = new Major();
        major.setId(id);
        majorMapper.deleteMajor(major);
        if(major.getResult()==-2){
            return RespBean.error("该分类下还有子分类，删除失败");
        }
        if(major.getResult()==1){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    /**
     * 通过学校id获取专业信息
     * @return
     */
    @Override
    public List<Major> getMajorsByCollegeId(Integer id) {
        return majorMapper.getMajorsByCollegeId(id);
    }

    @Override
    public List<Major> getMajorsByParentId(Integer pid) {
        return majorMapper.getMajorsByParentId(pid);
    }
}
