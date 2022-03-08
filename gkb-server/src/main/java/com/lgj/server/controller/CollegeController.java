package com.lgj.server.controller;


import com.lgj.server.pojo.*;
import com.lgj.server.service.ICollegeService;
import com.lgj.server.service.IMajorService;
import com.lgj.server.service.IMenuService;
import com.lgj.server.service.impl.MajorServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
@Api(tags = "院校信息管理")
@RestController
@RequestMapping("/system/basic/college")
public class CollegeController {

    @Autowired
    private ICollegeService collegeService;
    @Autowired
    private IMajorService majorService;

    @ApiOperation(value = "通过学校id获取专业信息")
    @GetMapping("/{id}")
    public List<Major> getMajorsByCollegeId(@PathVariable Integer id){
        return majorService.getMajorsByCollegeId(id);
    }

    @ApiOperation(value = "高校信息数据带分页")
    @GetMapping("/")
    public  PageBean getCollege(@RequestParam(defaultValue = "1") Integer page,
                                @RequestParam(defaultValue = "10") Integer size,College college,
                                LocalDate[] colDate){
        return collegeService.getCollegeByPage(page,size,college,colDate);
    }

    @ApiOperation(value = "新增学校信息")
    @PostMapping("/")
    private RespBean addCollege(@RequestBody College college){
        if (collegeService.save(college)){
            return RespBean.success("新增成功！！");
        }
        return RespBean.error("新增失败！！");
    }

    @ApiOperation(value = "更新学校信息")
    @PutMapping("/")
    public RespBean updateCollege(@RequestBody College college){
        if(collegeService.updateById(college)){
            return  RespBean.success("更新成功！！");
        }
        return RespBean.error("更新失败！！");
    }

    @ApiOperation(value = "删除学校信息")
    @DeleteMapping("/{id}")
    public RespBean deleteCollege(@PathVariable Integer id){
        if (collegeService.removeById(id)){
            return RespBean.success("删除成功！！");
        }
        return RespBean.error("删除失败！！");
    }

    @ApiOperation(value = "批量删除学校信息")
    @DeleteMapping("/")
    public RespBean deleteCollegeByIds(Integer[] ids){
        if (collegeService.removeByIds(Arrays.asList(ids))){
            return RespBean.success("删除成功！！");
        }
        return RespBean.error("删除失败！！");
    }

}
