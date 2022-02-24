package com.lgj.server.controller;


import com.lgj.server.pojo.City;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.service.ICityService;
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
 * @since 2022-02-01
 */
@RestController
@RequestMapping("/system/basic/city")
public class CityController {

    @Autowired
    private ICityService cityService;


    @ApiOperation(value = "获取所有城市信息")
    @GetMapping("/")
    public List<City> getAllCity(){
        return cityService.list();
    }

    @ApiOperation(value = "添加城市信息")
    @PostMapping("/")
    public RespBean addCity(@RequestBody City city){
        if(cityService.save(city)){
            return RespBean.success("添加成功");
        }
        return RespBean.error("添加失败！");
    }

    @ApiOperation(value = "更新城市信息")
    @PutMapping("/")
    public RespBean updateCity(@RequestBody City city){
        if (cityService.updateById(city)){
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }

    @ApiOperation(value = "删除城市信息")
    @DeleteMapping("/{id}")
    public RespBean deleteCity(@PathVariable Integer id){
        if (cityService.removeById(id)){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @ApiOperation(value = "批量删除城市信息")
    @DeleteMapping("/")
    public RespBean deleteCityByIds(Integer[] ids){
        if(cityService.removeByIds(Arrays.asList(ids))){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }
}
