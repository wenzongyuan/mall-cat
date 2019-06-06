package com.wzy.mallcat.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 交易包裹
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TradePackage extends Model<TradePackage> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 物流状态 0:待发货; 1:已发货
     */
    private Integer expressState;

    /**
     * 物流类型 0:手动发货; 1:系统自动发货
     */
    private Integer expressType;

    /**
     * 交易单id
     */
    private Long tradeId;

    /**
     * 交易编号
     */
    private String tradeNo;

    /**
     * 运单编号
     */
    private String expressNo;

    /**
     * 物流公司
     */
    private Long epId;

    /**
     * 物流公司名称
     */
    private String companyName;

    /**
     * 发货时间
     */
    private Date sendpackageDate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
