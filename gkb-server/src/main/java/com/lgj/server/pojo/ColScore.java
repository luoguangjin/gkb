package com.lgj.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("sys_col_score")
@ApiModel(value="ColScore对象", description="")
public class ColScore implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "学院编码")
    private String colCode;

    @ApiModelProperty(value = "招生年份")
    @JsonFormat(pattern = "yyyy",timezone = "Asia/Shanghai")
    private LocalDateTime year;

    @ApiModelProperty(value = "录取最高分")
    private String maxLine;

    @ApiModelProperty(value = "录取平均分")
    private String avgLine;

    @ApiModelProperty(value = "录取最低分")
    private String minLine;

    @ApiModelProperty(value = "招生类型")
    private String enrType;

    @ApiModelProperty(value = "录取批次")
    private String batch;

    @ApiModelProperty(value = "(0代表文，1代表理，2代表综合）")
    private Integer discType;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private LocalDateTime createTime;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;


}
