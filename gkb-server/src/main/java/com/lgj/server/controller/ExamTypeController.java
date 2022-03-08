package com.lgj.server.controller;


import com.lgj.server.pojo.ExamType;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.service.IExamTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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


}
