package com.wzy.mallcat.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 交易明细
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TradeOrder extends Model<TradeOrder> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 交易单id
     */
    private Long tradeId;

    /**
     * 交易编号
     */
    private String tradeNo;

    /**
     * 0:WAIT_BUYER_PAY （等待买家付款）1:WAIT_CONFIRM（待确认，包含待成团、待接单等等。即：买家已付款，等待成团或等待接单）2:WAIT_SELLER_SEND_GOODS（等待卖家发货，即：买家已付款）3:WAIT_BUYER_CONFIRM_GOODS (等待买家确认收货，即：卖家已发货) 4:TRADE_SUCCESS（买家已签收以及订单成功5:TRADE_CLOSED（交易关闭）
     */
    private String status;

    /**
     * 商品id
     */
    private Long productBaseId;

    /**
     * 商品名称
     */
    private String productBaseName;

    /**
     * 商品图片地址
     */
    private String productUrl;

    /**
     * 商品skuid
     */
    private Long productDetailId;

    /**
     * 商品规格值
     */
    private String productDetailName;

    /**
     * 包裹ID
     */
    private Long tradePackageId;

    /**
     * 商品价格
     */
    private Integer pdtSalePrice;

    /**
     * 商品购买数量
     */
    private Integer num;

    /**
     * 商品总价
     */
    private Integer totalFee;

    /**
     * 交易明细内的优惠金额
     */
    private Integer discountFee;

    /**
     * 实付金额
     */
    private Integer payFee;

    /**
     * 退款金额
     */
    private Integer refundedFee;

    /**
     * 商品sku编号
     */
    private String productDetailNo;

    @TableLogic
    private Integer delFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
