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
 * 交易单
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Trade extends Model<Trade> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 交易编号
     */
    private String tradeNo;

    /**
     * 父交易编号
     */
    private String parentNo;

    /**
     * 快递公司ID
     */
    private String sysExpressCompanyIds;

    /**
     * 0:普通订单
     */
    private Integer type;

    /**
     * 0:WAIT_BUYER_PAY （等待买家付款）1:WAIT_CONFIRM（待确认，包含待成团、待接单等等。即：买家已付款，等待成团或等待接单）2:WAIT_SELLER_SEND_GOODS（等待卖家发货，即：买家已付款）3:WAIT_BUYER_CONFIRM_GOODS (等待买家确认收货，即：卖家已发货) 4:TRADE_SUCCESS（买家已签收以及订单成功5:TRADE_CLOSED（交易关闭）WAIT_SELLER_ALL_SEND_GOODS(等待卖家全部发货,即:部分发货)ORDER_OUT_OF_DATE（订单过时）
     */
    private String status;

    /**
     * 买家
     */
    private Long buyerId;

    /**
     * 买家留言
     */
    private String buyerMessage;

    /**
     * 0:未关闭1:过期关闭2:标记退款3:订单取消4:买家取消5:卖家取消6:部分退款10:无法联系上买家11:买家误拍或重拍了12:买家无诚意完成交易13:已通过银行线下汇款14:已通过同城见面交易15:已通过货到付款交易16:已通过网上银行直接汇款17:已经缺货无法交易
     */
    private Integer closeType;

    /**
     * 交易关闭时间
     */
    private Date closeDate;

    /**
     * 交易过期时间
     */
    private Date expiredDate;

    /**
     * 交易确认时间
     */
    private Date confirmDate;

    /**
     * 发货方式 0:快递发货1:到店自提2:同城配送9:无需发货
     */
    private Integer expressType;

    /**
     * 收货人地址id
     */
    private Long receiverAddressId;

    /**
     * 收货人姓名
     */
    private String receiverName;

    /**
     * 收货人详细地址
     */
    private String receiverAddress;

    /**
     * 收货人手机号码
     */
    private String receiverMobile;

    /**
     * 订单发货时间
     */
    private Date consignDate;

    /**
     * 订单成功时间
     */
    private Date successDate;

    /**
     * 支付流水号
     */
    private String transactionId;

    /**
     * 0:默认值,未支付 1:微信小程序支付
     */
    private Integer payType;

    /**
     * 订单支付时间
     */
    private Date payDate;

    /**
     * 外部交易编号
     */
    private String outertNo;

    /**
     * 商品总价
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
     * 交易完成后退款金额
     */
    private Integer refundedFee;

    /**
     * 退款状态 0未退款1部分退款中2部分退款成功11全额退款中12全额退款成功
     */
    private Integer refundStatus;

    /**
     * 是否需要发票（0否1是）
     */
    private Integer isInvoice;

    /**
     * 商品ID
     */
    private String goodsIds;

    /**
     * 支付单ID
     */
    private String transIds;

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

    @TableLogic
    private Integer delFlag;

    /**
     * 确认收货过期时间
     */
    private Date receiveExpireDate;

    /**
     * 取消原因1库存不足2用户申请售后,6不想买了,7信息填写有误,8其他原因
     */
    private Integer cancelReason;

    /**
     * 备注
     */
    private String remark;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
