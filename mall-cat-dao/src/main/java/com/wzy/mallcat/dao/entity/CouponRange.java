package com.wzy.mallcat.dao.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class CouponRange extends Model<CouponRange> {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long productId;

    private Long couponId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
