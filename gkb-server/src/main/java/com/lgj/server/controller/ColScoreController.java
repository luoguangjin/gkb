package com.lgj.server.controller;


import com.lgj.server.pojo.ColScore;
import com.lgj.server.pojo.ExamType;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.service.IColScoreService;
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
@Api(tags = "高校分数线")
@RestController
@RequestMapping("system/basic/col-score")
public class ColScoreController {

    @Autowired
    private IColScoreService colScoreService;

    @ApiOperation(value = "获取高校分数线信息(带分页)")
    @GetMapping("/")
    public PageBean getColScoreByPage(@RequestParam(defaultValue = "1") Integer page,
                                      @RequestParam(defaultValue = "10") Integer size, ColScore colScore,
                                      LocalDate[] years){
        return colScoreService.getColScoreByPage(page,size,colScore,years);
    }

    @ApiOperation(value = "添加高校分数线")
    @PostMapping("/")
    public RespBean addColScore(@RequestBody ColScore colScore){
        if (colScoreService.save(colScore)){
            return RespBean.success("添加成功！！");
        }
        return RespBean.error("添加失败！！");
    }

    @ApiOperation(value = "更新高校分数线信息")
    @PutMapping("/")
    public RespBean updateColScore(@RequestBody ColScore colScore){
        if (colScoreService.updateById(colScore)){
            return RespBean.success("更新成功！！");
        }
        return RespBean.error("更新失败！！");
    }

    @ApiOperation(value = "删除数据")
    @DeleteMapping("/{id}")
    public RespBean deleteColScoreById(@PathVariable Integer id){
        if (colScoreService.removeById(id)){
            return RespBean.success("删除成功！！");
        }
        return RespBean.error("删除失败！！");
    }

    @ApiOperation(value = "批量删除")
    @DeleteMapping("/")
    public RespBean deleteColScore(Integer[] ids){
        if (colScoreService.removeByIds(Arrays.asList(ids))){
            return RespBean.success("批量删除成功！！");
        }
        return RespBean.error("批量删除失败！！");
    }

}
