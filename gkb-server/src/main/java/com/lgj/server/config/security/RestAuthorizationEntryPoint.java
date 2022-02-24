package com.lgj.server.config.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lgj.server.pojo.RespBean;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author:xiaoluo
 * @Description:当未登录或者token失效时访问接口时，自定义的返回结果
 * @Date:Created in 0:22 2022/1/23
 */
@Component
public class RestAuthorizationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        RespBean r = RespBean.error("未登录，请先登录！");
        r.setCode(401);
        out.write(new ObjectMapper().writeValueAsString(r));
        out.flush();
        out.close();
    }
}
