package com.lgj.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaoluo
 * @since 2022-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_college")
@ApiModel(value="College对象", description="")
public class College implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "学院代码")
    private Integer code;

    @ApiModelProperty(value = "学院名称")
    private String name;

    @ApiModelProperty(value = "城市id")
    private String cId;

    @ApiModelProperty(value = "院校特色（211、985）")
    private String collegeChatics;

    @ApiModelProperty(value = "院校隶属（教育部）")
    private String collegeSubje;

    @ApiModelProperty(value = "是否双一流")
    @TableField("isDualClass")
    private Integer isDualClass;

    @ApiModelProperty(value = "高校性质id")
    private String eId;

    @ApiModelProperty(value = "学院资质id")
    private String qId;

    @ApiModelProperty(value = "全国排名")
    private Integer ranking;

    @ApiModelProperty(value = "学院官网")
    private String webSite;

    @ApiModelProperty(value = "招生电话")
    private String number;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "学院LOGO")
    private String logo;

    @ApiModelProperty(value = "简介")
    private String intro;

    @ApiModelProperty(value = "学院创办时间")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private LocalDateTime collegeDate;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private LocalDateTime createTime;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "城市")
    @TableField(exist = false)
    private City city;

    @ApiModelProperty(value = "高校资质")
    @TableField(exist = false)
    private Qualificate qualificate;

    @ApiModelProperty(value = "高校性质")
    @TableField(exist = false)
    private Edulevel edulevel;


}
