package com.lgj.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2022-03-08
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

    @ApiModelProperty(value = "高校id")
    @TableField("colId")
    private String colId;

    @ApiModelProperty(value = "招生地区id")
    @TableField("cityId")
    private String cityId;

    @ApiModelProperty(value = "招生年份")
    private LocalDateTime year;

    @ApiModelProperty(value = "录取最高分")
    @TableField("maxLine")
    private String maxLine;

    @ApiModelProperty(value = "录取平均分")
    @TableField("avgLine")
    private String avgLine;

    @ApiModelProperty(value = "录取最低分")
    @TableField("minLine")
    private String minLine;

    @ApiModelProperty(value = "录取人数")
    private Integer num;

    @ApiModelProperty(value = "录取批次编号")
    @TableField("batchId")
    private String batchId;

    @ApiModelProperty(value = "考生类别编号")
    @TableField("examId")
    private String examId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "高校")
    @TableField(exist = false)
    private College college;

    @ApiModelProperty(value = "城市")
    @TableField(exist = false)
    private City city;

    @ApiModelProperty(value = "考生类别")
    @TableField(exist = false)
    private ExamType examType;

    @ApiModelProperty(value = "录取批次")
    @TableField(exist = false)
    private Batch batch;

}
