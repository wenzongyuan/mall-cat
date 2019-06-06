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
 * 会员收货地址
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MemberReceivingAddress extends Model<MemberReceivingAddress> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 会员id
     */
    private Long memberId;

    /**
     * 收货人名称
     */
    private String receivingUserName;

    /**
     * 收货人联系电话
     */
    private String receivingUserPhone;

    /**
     * 所在省份id
     */
    private Long provinceId;

    /**
     * 所在市id
     */
    private Long cityId;

    /**
     * 所在区县id
     */
    private Long areaId;

    /**
     * 地址详细
     */
    private String addressDetail;

    /**
     * 是否为默认地址（0：是 1：否）
     */
    private Integer isDefault;

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


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
