package com.lgj.server.utils;

import com.lgj.server.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @Classname AdminUtils
 * @Description TODO
 * @Date 2022/2/19 18:00
 * @Created by XL
 */
public class AdminUtils {


    /**
     *@Description TODO
     * 获取当前后台系统登录的人员
     *@param
     *@return com.lgj.server.pojo.Admin
     *@date 2022/2/19 18:01
     *@auther 24964
     */
    public static Admin getCurrenAdmin(){
        return (Admin)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }


}
