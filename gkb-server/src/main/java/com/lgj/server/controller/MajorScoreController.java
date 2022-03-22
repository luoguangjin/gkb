package com.lgj.server.controller;


import com.lgj.server.pojo.MajorScore;
import com.lgj.server.pojo.MajorScore;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.service.IMajorScoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-08
 */
@Api(tags = "专业分数线管理")
@RestController
@RequestMapping("system/basic/major-score")
public class MajorScoreController {

    @Autowired
    private IMajorScoreService majorScoreService;

    @ApiOperation(value = "获取专业分数线信息(带分页)")
    @GetMapping("/")
    public PageBean getMajorScoreByPage(@RequestParam(defaultValue = "1") Integer page,
                                        @RequestParam(defaultValue = "10") Integer size, MajorScore majorScore,
                                        LocalDate[] years){
        return majorScoreService.getMajorScoreByPage(page,size,majorScore,years);
    }
    
    @ApiOperation(value = "添加专业分数线")
    @PostMapping("/")
    public RespBean addMajorScore(@RequestBody MajorScore majorScore){
        if (majorScoreService.save(majorScore)){
            return RespBean.success("添加成功！！");
        }
        return RespBean.error("添加失败！！");
    }

    @ApiOperation(value = "更新专业分数线信息")
    @PutMapping("/")
    public RespBean updateMajorScore(@RequestBody MajorScore majorScore){
        if (majorScoreService.updateById(majorScore)){
            return RespBean.success("更新成功！！");
        }
        return RespBean.error("更新失败！！");
    }

    @ApiOperation(value = "删除数据")
    @DeleteMapping("/{id}")
    public RespBean deleteMajorScoreById(@PathVariable Integer id){
        if (majorScoreService.removeById(id)){
            return RespBean.success("删除成功！！");
        }
        return RespBean.error("删除失败！！");
    }

    @ApiOperation(value = "批量删除")
    @DeleteMapping("/")
    public RespBean deleteMajorScore(Integer[] ids){
        if (majorScoreService.removeByIds(Arrays.asList(ids))){
            return RespBean.success("批量删除成功！！");
        }
        return RespBean.error("批量删除失败！！");
    }
}
