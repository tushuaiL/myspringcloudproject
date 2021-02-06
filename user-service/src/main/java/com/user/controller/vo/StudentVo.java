package com.user.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: tushuai
 * @Description:
 * @Date Created in 2021-01-19 20:46
 * @Modified By:
 */
@ApiModel(value = "查找学生入参实体")
@Data
public class StudentVo {

    @ApiModelProperty(name = "number", value = "学号")
    private String number;

//    @ApiModelProperty(name = "deleteFlag", value = "删除标识")
//    private Boolean deleteFlag;
}
