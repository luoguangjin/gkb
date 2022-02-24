package com.lgj.server.config.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:xiaoluo
 * @Description: JwtToken工具类
 * @Date:Created in 11:40 2022/1/22
 */
@Component
public class JwtTokenUtil {

    private static final String CLATM_KEY_USERNAME = "sub";//准备用户名的key
    private static final String CLATM_KEY_CREATED = "created";//准备创建时间的key
    //jwt的密钥和失效时间通过value去拿
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private Long expiration;

    //通过用户名生成token,生成token后通过token拿用户名,可判断token是否失效,是否被刷新

    /**
     * 根据用户信息生成token
     * @param userDetails
     * @return
     */
    public String generateToken(UserDetails userDetails){
        Map<String,Object> claims = new HashMap<>();
        claims.put(CLATM_KEY_USERNAME,userDetails.getUsername());
        claims.put(CLATM_KEY_CREATED,new Date());
        return generateToken(claims);
    }

    /**
     * 从token中获取用户名
     * @param token
     * @return
     */
    public String getUserNameFromToken(String token){
        String username;
        try{
            Claims claims = getClaimsFormToken(token);
            username = claims.getSubject();
        } catch (Exception e){
            username = null;
        }
        return username;

    }
    /**
     * 从token中获取荷载
     * @param token
     * @return
     */
    private Claims getClaimsFormToken(String token) {
        Claims claims =null;
        try {
             claims = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e){
            e.printStackTrace();
        }
        return claims;
    }

    /**
     * 验证token是否有效
     * @param token
     * @param userDetails
     * @return
     */
    public  boolean validateToken(String token,UserDetails userDetails){
        String username = getUserNameFromToken(token);
        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
    }

    /**
     * 判断token是否可以被刷新
     * @param token
     * @return
     */
    public boolean canRefresh(String token){
        return !isTokenExpired(token);
    }

    /**
     * 刷新token
     * @param token
     * @return
     */
    public String refreshToken(String token){
        Claims claims = getClaimsFormToken(token);
        claims.put(CLATM_KEY_CREATED,new Date());
        return generateToken(claims);
    }

    /**
     * 判断token是否失效
     * @param token
     * @return
     */
    private boolean isTokenExpired(String token) {
        Date expirteDate = getExpiredDateFromToken(token);
        return expirteDate.before(new Date());
    }

    /**
     * 从token中获取失效时间
     * @param token
     * @return
     */
    private Date getExpiredDateFromToken(String token) {
        Claims claims = getClaimsFormToken(token);
        return claims.getExpiration();
    }


    /**
     * 根据荷载生成 jwt token
     * @param claims
     * @return
     */
    private String generateToken( Map<String,Object> claims){
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS512,secret)
                .compact();
    }
    /**
     * 生成token失效时间
     * @return
     */
    private Date generateExpirationDate(){
        return new Date(System.currentTimeMillis() + expiration *1000);
    }

}
