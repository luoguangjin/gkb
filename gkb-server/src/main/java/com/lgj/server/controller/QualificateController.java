package com.lgj.server.controller;


import com.lgj.server.pojo.Edulevel;
import com.lgj.server.pojo.Qualificate;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.service.IQualificateService;
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
@Api(tags = "院校资质管理")
@RestController
@RequestMapping("/system/basic/qualificate")
public class QualificateController {

    @Autowired
    private IQualificateService qualificateService;

    @ApiOperation(value = "获取所有资质信息")
    @GetMapping("/")
    public List<Qualificate> getQuaAll(){
        return qualificateService.list();
    }

    @ApiOperation(value = "添加资质信息")
    @PostMapping("/")
    public RespBean addQualificate(@RequestBody Qualificate qualificate){
        if(qualificateService.save(qualificate)){
            return RespBean.success("添加成功！");
        }
            return RespBean.error("添加失败");
    }

    @ApiOperation(value = "更新资质信息")
    @PutMapping("/")
    public RespBean updateQua(@RequestBody Qualificate qualificate){
        if (qualificateService.updateById(qualificate)){
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }

    @ApiOperation(value = "删除资质信息")
    @DeleteMapping("/{id}")
    public RespBean deleteQua(@PathVariable Integer id){
        if(qualificateService.removeById(id)){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @ApiOperation(value = "批量删除资质信息")
    @DeleteMapping("/")
    public RespBean deleteEdulevelByIds(Integer[] ids){
        if(qualificateService.removeByIds(Arrays.asList(ids))){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

}
