package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.MenuRoleMapper;
import com.lgj.server.pojo.MenuRole;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.service.IMenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Transient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.transport.proxy.RMIDirectSocketFactory;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole> implements IMenuRoleService {


    @Autowired
    private MenuRoleMapper menuRoleMapper;


    /**
     *@Description TODO
     * 更新角色菜单
     *@param
     *@return com.lgj.server.pojo.RespBean
     *@date 2022/2/3 0:18
     *@auther 24964
     */
    @Override
    @Transactional
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.delete(new QueryWrapper<MenuRole>().eq("rid",rid));
        if(mids==null||mids.length==0){
            return RespBean.success("更新成功！");
        }
        Integer result = menuRoleMapper.insertRecord(rid,mids);
        if(result==mids.length){
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
