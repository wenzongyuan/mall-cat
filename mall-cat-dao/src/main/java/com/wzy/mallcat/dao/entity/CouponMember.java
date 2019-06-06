package com.wzy.mallcat.dao.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
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
public class CouponMember extends Model<CouponMember> {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long memberId;

    private Long couponId;

    /**
     * 1:可使用 2:已使用 3:已过期
     */
    private Integer status;

    private Date receiveTime;

    private Date usedTime;

    private Long tradeId;

    /**
     * 0:是 1:否
     */
    private Integer isLook;

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


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
