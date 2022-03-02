package com.lgj.server.controller;


import com.lgj.server.pojo.News;
import com.lgj.server.pojo.PageBean;
import com.lgj.server.pojo.User;
import com.lgj.server.service.impl.NewsServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
@Api(tags = "新闻信息管理")
@RestController
@RequestMapping("/system/basic/news")
public class NewsController {

    @Autowired
    private NewsServiceImpl newsService;

    @ApiOperation(value = "新闻数据带分页")
    @GetMapping("/")
    public PageBean getUser(@RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "10") Integer size, News news,
                            LocalDate[] dateScope){//dateScope用来接收时间

        return newsService.getNewByPage(page,size,news,dateScope);
    }



}
