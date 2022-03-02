package com.lgj.server.controller;


import com.lgj.server.pojo.Column;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.service.IColumnService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoluo
 * @since 2022-02-01
 */
@Api(tags = "动态分类管理")
@RestController
@RequestMapping("/system/basic/column")
public class ColumnController {

    @Autowired
    private IColumnService columnService;


    @ApiOperation(value = "获取所有动态分类")
    @GetMapping("/")
    private List<Column> getAllColumns(){
        return columnService.getAllColumns();
    }

   @ApiOperation(value = "添加动态分类")
    @PostMapping("/")
    private RespBean addCol(@RequestBody Column column){
        return columnService.addCol(column);
   }

   @ApiOperation(value = "删除动态分类")
    @DeleteMapping("/{id}")
    private RespBean deleteCol(@PathVariable Integer id){
        return columnService.deleteCol(id);
   }

}
