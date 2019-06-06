package com.wzy.mallcat.dao.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CouponGroup extends Model<CouponGroup> {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 优惠券名称
     */
    private String title;

    /**
     * 活动图片
     */
    private Long fileId;

    /**
     * 活动图片路径
     */
    private String filePath;

    /**
     * 0:系统发放 1:用户领取
     */
    private Integer issueType;

    /**
     * 0:所有用户 1:指定用户
     */
    private Integer issueTarget;

    /**
     * 0:待发放 1:发放中 2:发放完成 3:已终止
     */
    private Integer issueStatus;

    /**
     * 赠券开始时间
     */
    private Date issueStartTime;

    /**
     * 赠券结束时间
     */
    private Date issueEndTime;

    /**
     * 发放总量
     */
    private Integer total;

    private Integer stock;

    /**
     * 0:全部商品 1:指定商品
     */
    private Integer rangeType;

    /**
     * 使用说明
     */
    private String description;

    /**
     * 数量限制
     */
    private Integer quota;

    /**
     * 满多少金额可用 (单位:分)0-不限制,大于0-多少金额可用
     */
    private Integer condition;

    /**
     * 生效开始时间
     */
    private Date validStartTime;

    /**
     * 生效结束时间
     */
    private Date validEndTime;

    /**
     * 1-代金卷
     */
    @TableField("preferentialType")
    private Integer preferentialType;

    /**
     * 优惠金额，单位：分
     */
    private Integer value;

    /**
     * 领取优惠券的次数
     */
    @TableField("stat_Fetch_Num")
    private Integer statFetchNum;

    /**
     * 使用优惠券的次数
     */
    @TableField("stat_Use_Num")
    private Integer statUseNum;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 修改人
     */
    private Long updateBy;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;

    /**
     * 是否删除(0正常,1删除)
     */
    @TableLogic
    private Integer delFlag;

    /**
     * 活动状态 0:未开始 1:进行中 2:已结束
     */
    private Integer groupStatus;

    /**
     * 用户电话集合字符串
     */
    @TableField("userTels")
    private String userTels;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
