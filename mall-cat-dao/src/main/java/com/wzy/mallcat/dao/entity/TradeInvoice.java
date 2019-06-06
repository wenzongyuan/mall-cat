package com.wzy.mallcat.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 交易发票
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TradeInvoice extends Model<TradeInvoice> {

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
     * 发票类型 0:个人1:企业
     */
    private Integer invoiceType;

    /**
     * 纳税人识别号
     */
    private String invoiceTaxNo;

    /**
     * 发票抬头
     */
    private String invoiceTitle;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
