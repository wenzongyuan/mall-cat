package com.wzy.mallcat.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员信息基础表
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MemberInfo extends Model<MemberInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 密码(微信用户非必须 app用户必须)
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 头像url
     */
    private String avatarUrl;

    /**
     * 会员编号
     */
    private String memberNo;

    /**
     * 会员名称（微信用户默认呢称，app用户默认手机号）
     */
    private String memberName;

    /**
     * 会员渠道(1:微信 2:android 3:ios 4:pc)
     */
    private Integer memberChannel;

    /**
     * 性别(0:未知 1：男 2：女)
     */
    private Integer gender;

    /**
     * 城市名称
     */
    private String city;

    /**
     * 省份
     */
    private String province;

    /**
     * 国籍
     */
    private String country;

    /**
     * 会员邀请码
     */
    private String invitationCode;

    /**
     * 是否删除(0正常,1删除)
     */
    @TableLogic
    private Integer delFlag;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 更新人
     */
    private Long updateBy;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

    /**
     * 最后更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;

    /**
     * 店铺ID
     */
    private Long shopId;

    /**
     * 最后一次登录时间
     */
    private Date lastLoginDate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
