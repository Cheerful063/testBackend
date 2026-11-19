package com.neu.carbon.distribusion.domain;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.neu.common.annotation.Excel;
import com.neu.common.core.domain.BaseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * product对象 distribusion_product
 * 
 * @author neuedu
 * @date 2024-01-23
 */
@ApiModel("product")
@Data
public class DistribusionProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @ApiModelProperty("id")
    private Long id;

    /** 适用行业 */
    @ApiModelProperty("适用行业")
    @Excel(name = "适用行业")
    private String suitable;

    private String suitableLabel;

    /** 额度 */
    @ApiModelProperty("额度")
    @Excel(name = "额度")
    private String credit;

    /** 价格 */
    @ApiModelProperty("价格")
    @Excel(name = "价格")
    private String price;

    /** 详情 */
    @ApiModelProperty("详情")
    @Excel(name = "详情")
    private String detail;


}
