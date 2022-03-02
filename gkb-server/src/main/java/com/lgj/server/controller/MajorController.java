package com.lgj.server.controller;


import com.lgj.server.pojo.Column;
import com.lgj.server.pojo.Major;
import com.lgj.server.service.impl.MajorServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private List<Major> getAllMajors(){
        return majorService.getAllMajors();
    }

}
