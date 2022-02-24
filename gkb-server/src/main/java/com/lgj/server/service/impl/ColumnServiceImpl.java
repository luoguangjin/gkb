package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.mapper.ColumnMapper;
import com.lgj.server.pojo.Column;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.service.IColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-02-01
 */
@Service
public class ColumnServiceImpl extends ServiceImpl<ColumnMapper, Column> implements IColumnService {

    @Autowired
    private ColumnMapper columnMapper;

  /**
   *@Description TODO
   *获取所有分类
   *@return java.util.List<com.lgj.server.pojo.Column>
   *@date 2022/2/1 20:18
   *@auther 24964
   */
    @Override
    public List<Column> getAllColumns() {
        return columnMapper.getAllColumns(-1);
    }

    @Override
    public RespBean addCol(Column column) {
        column.setEnabled(true);
        columnMapper.addCol(column);
        System.out.println(column.getResult());
        if (column.getResult()==1){
            return RespBean.success("添加成功",column);
        }
        return RespBean.error("添加失败");
    }

    @Override
    public RespBean deleteCol(Integer id) {
        Column column = new Column();
        column.setId(id);
        columnMapper.deleteCol(column);
        if(column.getResult()==-2){
            return RespBean.error("该分类下还有子分类，删除失败");
        }
        if(column.getResult()==-1){
            return RespBean.error("该分类下关联有文章，删除失败！");
        }
        if(column.getResult()==1){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }
}
