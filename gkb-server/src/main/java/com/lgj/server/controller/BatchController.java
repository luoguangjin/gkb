package com.lgj.server.controller;


import com.lgj.server.pojo.Batch;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.pojo.User;
import com.lgj.server.service.IBatchService;
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
@Api(tags = "录取批次信息管理")
@RestController
@RequestMapping("/system/basic/batch")
public class BatchController {

    @Autowired
    private IBatchService batchService;

    @ApiOperation(value = "获取录取批次信息(带分页)")
    @GetMapping("/")
    public PageBean getBatch(@RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "10") Integer size, Batch batch){

        return batchService.getBatchByPage(page,size,batch);
    }

    @ApiOperation(value = "添加批次信息")
    @PostMapping("/")
    public RespBean addBatch(@RequestBody Batch batch){
        if (batchService.save(batch)){
            return RespBean.success("添加成功！！");
        }
        return RespBean.error("添加失败！！");
    }

    @ApiOperation(value = "更新批次信息")
    @PutMapping("/")
    public RespBean updateBatch(@RequestBody Batch batch){
        if (batchService.updateById(batch)){
            return RespBean.success("更新成功！！");
        }
        return RespBean.error("更新失败！！");
    }

    @ApiOperation(value = "删除批次信息")
    @DeleteMapping("/{id}")
    public RespBean deleteBatchById(@PathVariable Integer id){
        if (batchService.removeById(id)){
            return RespBean.success("删除成功！！");
        }
        return RespBean.error("删除失败！！");
    }

    @ApiOperation(value = "批量删除批次信息")
    @DeleteMapping("/")
    public RespBean deleteBatch(@PathVariable Integer[] ids){
        if(batchService.removeBatchByIds(Arrays.asList(ids))){
            return RespBean.success("删除成功！！！");
        }
        return RespBean.error("删除失败！！！");
    }

}
