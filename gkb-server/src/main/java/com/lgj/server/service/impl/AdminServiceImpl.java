package com.lgj.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgj.server.config.security.JwtTokenUtil;
import com.lgj.server.mapper.AdminMapper;
import com.lgj.server.mapper.AdminRoleMapper;
import com.lgj.server.mapper.RoleMapper;
import com.lgj.server.pojo.*;
import com.lgj.server.service.IAdminService;
import com.lgj.server.utils.AdminUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoluo
 * @since 2022-01-24
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private AdminRoleMapper adminRoleMapper;


    /**
     * 登录返回
     * @param username
     * @param password
     * @param request
     * @return
     */
    @Override
    public RespBean login(String username, String password,String code, HttpServletRequest request) {

        String captcha = (String) request.getSession().getAttribute("captcha");
        if(StringUtils.isEmpty(code)||!captcha.equalsIgnoreCase(code)){
            return RespBean.error("验证码输入错误，请重新输入");
        }

        //登录
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if(userDetails==null||!passwordEncoder.matches(password,userDetails.getPassword())){
            return RespBean.error("用户名或者密码错误!");
        }
        if(!userDetails.isEnabled()){
            return RespBean.error("账号被禁用,请联系管理员!");
        }
        //更新登录用户对象
        UsernamePasswordAuthenticationToken authenticationToken = new
                UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        //生成token
        String token = jwtTokenUtil.generateToken(userDetails);
        Map<String,String> tokenMap = new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return RespBean.success("登录成功",tokenMap);
    }

    /**
     * 获取当前用户信息
     * @param username
     * @return
     */
    @Override
    public Admin getAdminByUsername(String username) {
        return adminMapper.selectOne(new QueryWrapper<Admin>().eq("username",username).eq
                ("enabled",true));
    }


    /**
     *@Description TODO 根据用户id查询角色列表
     *@param adminId
     *@return java.util.List<com.lgj.server.pojo.Role>
     *@date 2022/1/28 0:12
     *@auther 24964
     */
    @Override
    public List<Role> getRoles(Integer adminId) {
        return roleMapper.getRoles(adminId);
    }


    /**
     *@Description TODO
     * 获取所有操作员信息
     *@param
     *@return java.util.List<com.lgj.server.pojo.Admin>
     *@date 2022/2/19 17:55
     *@auther 24964
     */
    @Override
    public List<Admin> getAllAdmins(String keyword) {
        System.out.println(AdminUtils.getCurrenAdmin().getId());
        return adminMapper.getAllAdmin(((Admin)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId(),keyword);
    }

    /**
     *@Description TODO
     * 更新系统操作员角色
     *@return com.lgj.server.pojo.RespBean
     *@date 2022/2/20 1:01
     *@auther 24964
     */
    @Override
    public RespBean updateAdminRole(Integer adminId, Integer[] rids) {

        adminRoleMapper.delete(new QueryWrapper<AdminRole>().eq("adminId",adminId));
        Integer rs = adminRoleMapper.updateAdminRole(adminId,rids);
        if (rs== rids.length){
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }


}
