package com.lgj.server.controller;


import com.lgj.server.pojo.Column;
import com.lgj.server.pojo.Major;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.service.impl.MajorServiceImpl;
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
 * @since 2022-03-01
 */
@Api(tags = "专业信息管理")
@RestController
@RequestMapping("/system/basic/major")
public class MajorController {

    @Autowired
    private MajorServiceImpl majorService;

    @ApiOperation(value = "获取所有专业信息")
    @GetMapping("/")
    public List<Major> getAllMajors(){
        return majorService.getAllMajors();
    }

    @ApiOperation(value = "添加专业信息")
    @PostMapping("/")
    public RespBean addMajor(@RequestBody Major major){
        return majorService.addMajor(major);
    }

    @ApiOperation(value = "删除专业信息")
    @DeleteMapping("/{id}")
    private RespBean deleteMajor(@PathVariable Integer id){
        return majorService.deleteMajor(id);
    }

}
