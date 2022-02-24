package com.lgj.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgj.server.pojo.Column;
import com.lgj.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-02-01
 */
public interface IColumnService extends IService<Column> {

    /**
     *@Description TODO
     *获取所有分类
     *@return java.util.List<com.lgj.server.pojo.Column>
     *@date 2022/2/1 20:16
     *@auther 24964
     */
    List<Column> getAllColumns();

    /**
     *@Description TODO
     *添加动态分类
     *@return com.lgj.server.pojo.RespBean
     *@date 2022/2/6 1:16
     *@auther 24964
     */
    RespBean addCol(Column column);

    /**
     *@Description TODO
     * 删除部门
     *@param
     *@return
     *@date 2022/2/19 16:35
     *@auther 24964
     */
    RespBean deleteCol(Integer id);
}
