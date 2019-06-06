package com.wzy.mallcat.dao.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
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
public class AfterSaleTrade extends Model<AfterSaleTrade> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 订单id
     */
    private Long tradeId;

    /**
     * 订单编号
     */
    private String tradeNo;

    /**
     * 商品类目id
     */
    private Long productCategoryId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * sku编号
     */
    private String skuNo;

    /**
     * 退货数量
     */
    private Integer refundNum;

    /**
     * 规格id
     */
    private String specIds;

    /**
     * 规格名称
     */
    private String specNames;

    /**
     * 退款金额
     */
    private Integer refundedFee;

    /**
     * 1:退货退款 2:仅退款
     */
    private Integer type;

    /**
     * 售后发起时间
     */
    private Date afterSalesTime;

    /**
     * 退款原因,1无理由退换货,2质量问题,3尺寸不符,4少件/漏发
     */
    private Integer refundReason;

    /**
     * 退款说明
     */
    private String refundedDescription;

    /**
     * 操作者id
     */
    private Long handlerId;

    /**
     * 操作者姓名
     */
    private String handlerName;

    /**
     * 1:未退款 2:已退款
     */
    private Integer refundStatus;

    /**
     * 操作退款时间
     */
    private Date handleRefundTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
