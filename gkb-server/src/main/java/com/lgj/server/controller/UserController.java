package com.lgj.server.controller;


import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.pojo.RespBean;
import com.lgj.server.pojo.User;
import com.lgj.server.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
@RestController
@RequestMapping("/user/basic")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "用户数据")
    @GetMapping("/")
    public PageBean getUser(@RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "10") Integer size, User user,
                            LocalDate[] dateScope){//dateScope用来接收时间

        return userService.getUserByPage(page,size,user,dateScope);
    }

    @ApiOperation(value = "添加用户信息")
    @PostMapping("/")
    public RespBean addUser(@RequestBody User user){
        if(userService.save(user)){
            return RespBean.success("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @ApiOperation(value = "更新用户信息")
    @PutMapping("/")
    public RespBean updateUser(@RequestBody User user){
        if(userService.updateById(user)){
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }

    @ApiOperation(value = "删除用户信息")
    @DeleteMapping("/{id}")
    public RespBean deleteUser(@PathVariable Integer id){
        if(userService.removeById(id)){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @ApiOperation(value = "批量删除用户信息")
    @DeleteMapping("/")
    public RespBean deleteUserByIds(Integer[] ids){
        if(userService.removeByIds(Arrays.asList(ids))){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @ApiOperation(value = "导出用户数据")
    @GetMapping(value = "/export",produces = "application/octet-stream")
    public void exportUser(HttpServletResponse response){
        List<User> list = userService.list();
        ExportParams params = new ExportParams("用户表",ExcelType.HSSF.name());
        Workbook workbook = ExcelExportUtil.exportExcel(params,User.class,list);
        ServletOutputStream outputStream = null;
        try {
            //用流的方式输出
            response.setHeader("content-type","application/octet-stream");
            //防止乱码
            response.setHeader("content-disposition","attachment;filename="+ URLEncoder.encode("用户表.xls","UTF-8"));
            outputStream = response.getOutputStream();
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null!=outputStream){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
