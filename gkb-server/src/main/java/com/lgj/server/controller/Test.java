package com.lgj.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2022/1/28 0:55
 * @Created by 24964
 */
@RestController
public class Test {

    @GetMapping("/employee/basic/hello")
    public String h1(){
        return "/employee/basic/hello";
    }

    @GetMapping("/employee/advanced/**")
    public String h2(){
        return "/employee/advanced/hello";
    }
}
