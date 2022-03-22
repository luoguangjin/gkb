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
import java.util.List;

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
@TableName("sys_major")
@ApiModel(value="Major对象", description="")
public class Major implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "专业名称")
    private String name;

    @ApiModelProperty(value = "父id")
    @TableField("parentId")
    private Integer parentId;

    @ApiModelProperty(value = "路径")
    @TableField("depPath")
    private String depPath;

    @ApiModelProperty(value = "专业描述")
    private String des;

    @ApiModelProperty(value = "是否启用")
    private Boolean enabled;

    @ApiModelProperty(value = "是否上级")
    @TableField("isParent")
    private Boolean isParent;

    @ApiModelProperty(value = "子栏目列表")
    @TableField(exist = false)
    private List<Major> children;

    @ApiModelProperty(value = "返回结果，存储过程使用")
    @TableField(exist = false)
    private Integer result;




}
