package com.lgj.server.controller;


import com.lgj.server.pojo.ExamType;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.service.IExamTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-08
 */
@Api(tags = "考生类别管理")
@RestController
@RequestMapping("/system/basic/exam-type")
public class ExamTypeController {


    @Autowired
    private IExamTypeService examTypeService;

    @ApiOperation(value = "获取考生类别(带分页)")
    @GetMapping("/")
    public PageBean getExamTypeByPage(@RequestParam(defaultValue = "1") Integer page,
                                      @RequestParam(defaultValue = "10") Integer size, ExamType examType){
        return examTypeService.getExamTypeByPage(page,size,examType);
    }

    @ApiOperation(value = "添加考生类别")
    @PostMapping("/")
    public RespBean addExamType(@RequestBody ExamType examType){
        if (examTypeService.save(examType)){
            return RespBean.success("添加成功！！");
        }
        return RespBean.error("添加失败！！");
    }

    @ApiOperation(value = "更新考生类别信息")
    @PutMapping("/")
    public RespBean updateExamType(@RequestBody ExamType examType){
        if (examTypeService.updateById(examType)){
            return RespBean.success("更新成功！！");
        }
        return  RespBean.error("更新失败！！");
    }

    @ApiOperation(value = "删除考生类别")
    @DeleteMapping("/{id}")
    public RespBean deleteExamTypeById(@PathVariable Integer id){
        if (examTypeService.removeById(id)){
            return RespBean.success("删除成功！！");
        }
        return RespBean.error("删除失败！！");
    }

    @ApiOperation(value = "批量删除信息")
    @DeleteMapping("/")
    public RespBean deleteExamType(Integer[] ids){
        if (examTypeService.removeByIds(Arrays.asList(ids))){
            return RespBean.success("批量删除成功！！");
        }
        return RespBean.error("批量删除失败！！");
    }

}
