package com.lgj.server.controller;


import com.lgj.server.pojo.*;
import com.lgj.server.service.IEdulevelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
@Api(tags = "高校性质信息")
@RestController
@RequestMapping("/system/basic/edulevel")
public class EdulevelController {
    @Autowired
    private IEdulevelService edulevelService;


    @ApiOperation(value = "获取所有高校性质信息")
    @GetMapping("/")
    public List<Edulevel> getAllEdulevel(){
        return edulevelService.list();
    }

    @ApiOperation(value = "高校性质信息(带分页)")
    @GetMapping("/page")
    public PageBean getEdulevelPage(@RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "10") Integer size, Edulevel edulevel){
        return edulevelService.getEdulevelPage(page,size,edulevel);
    }

    @ApiOperation(value = "添加高校性质信息")
    @PostMapping("/")
    public RespBean addEdulevel(@RequestBody Edulevel edulevel){
        if(edulevelService.save(edulevel)){
            return RespBean.success("添加成功");
        }
        return RespBean.error("添加失败！");
    }

    @ApiOperation(value = "更新高校性质信息")
    @PutMapping("/")
    public RespBean updateCity(@RequestBody Edulevel edulevel){
        if (edulevelService.updateById(edulevel)){
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }

    @ApiOperation(value = "删除高校性质信息")
    @DeleteMapping("/{id}")
    public RespBean deleteEdulevel(@PathVariable Integer id){
        if (edulevelService.removeById(id)){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @ApiOperation(value = "批量删除高校性质信息")
    @DeleteMapping("/")
    public RespBean deleteEdulevelByIds(Integer[] ids){
        if(edulevelService.removeByIds(Arrays.asList(ids))){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }
}
