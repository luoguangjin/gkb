package com.lgj.server.controller;


import com.lgj.server.pojo.*;
import com.lgj.server.service.impl.ColumnServiceImpl;
import com.lgj.server.service.impl.NewsServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

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
    @Autowired
    private ColumnServiceImpl columnService;

    @ApiOperation(value = "新闻数据带分页")
    @GetMapping("/")
    public PageBean getNewsByPage(@RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "10") Integer size, News news,
                                  LocalDate[] createTime){//dateScope用来接收时间

        return newsService.getNewsByPage(page,size,news,createTime);
    }

    @ApiOperation(value = "获取所有动态分类")
    @GetMapping("/column")
    private List<Column> getColumnAll(){
        return columnService.getAllColumns();
    }

    @ApiOperation(value = "添加动态")
    @PostMapping("/")
    private RespBean addNews(News news){
        if (newsService.save(news)){
            return RespBean.success("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

}
