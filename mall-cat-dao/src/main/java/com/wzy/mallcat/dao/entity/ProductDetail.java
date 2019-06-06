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
 * 商品SKU表
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ProductDetail extends Model<ProductDetail> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 供应商ID
     */
    private Long supplierId;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 商品编号
     */
    private String productNo;

    /**
     * sku编号
     */
    private String pdtNo;

    /**
     * 供应商编号
     */
    private String supplierNo;

    /**
     * 安全库存
     */
    private Integer redNum;

    /**
     * 销量
     */
    private Integer saleNum;

    /**
     * 总库存
     */
    private Integer totalStock;

    /**
     * 可下单库存
     */
    private Integer pdtStock;

    /**
     * 冻结库存
     */
    private Integer freezeStock;

    /**
     * 重量
     */
    private Integer weight;

    /**
     * 销售价格
     */
    private Integer salePrice;

    /**
     * 成本价
     */
    private Integer costPrice;

    /**
     * 市场价
     */
    private Integer marketPrice;

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
