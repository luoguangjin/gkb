package com.lgj.server.config.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lgj.server.pojo.RespBean;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author:xiaoluo
 * @Description:当访问接口权限不够时，自定义返回结果
 * @Date:Created in 0:28 2022/1/23
 */
@Component
public class RestfulAccessDenieHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        RespBean r = RespBean.error("权限不足，请联系管理员！");
        r.setCode(403);
        out.write(new ObjectMapper().writeValueAsString(r));
        out.flush();
        out.close();
    }
}
