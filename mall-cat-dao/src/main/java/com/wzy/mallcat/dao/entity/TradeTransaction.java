package com.wzy.mallcat.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 交易支付单
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TradeTransaction extends Model<TradeTransaction> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 交易ID
     */
    private Long tradeId;

    /**
     * 交易编号
     */
    private String tradeNo;

    /**
     * 外部交易编号
     */
    private String outertNo;

    /**
     * 支付使用的第三方支付渠道
     */
    private String channel;

    /**
     * 是否是 live 模式
     */
    private Integer liveMode;

    /**
     * 0:待支付：created 1:已付款：paid 2:存在退款：refunded 3:已取消：canceled
     */
    private Integer status;

    /**
     * 总价
     */
    private Integer totalFee;

    /**
     * 运费
     */
    private Integer postFee;

    /**
     * 优惠金额
     */
    private Integer discountFee;

    /**
     * 实付金额
     */
    private Integer payFee;

    /**
     * 订单支付时间
     */
    private Date payDate;

    /**
     * 退款金额
     */
    private Integer refundedFee;

    /**
     * 退款时间
     */
    private Date refundedDate;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
