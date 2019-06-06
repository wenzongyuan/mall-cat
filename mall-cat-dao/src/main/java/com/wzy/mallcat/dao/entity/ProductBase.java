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
 * 商品基本表
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ProductBase extends Model<ProductBase> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品编号
     */
    private String productNo;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品描述
     */
    private String descs;

    /**
     * 品牌ID
     */
    private Long brandId;

    /**
     * 状态（0待审核1驳回2待上架3已上架4售罄5下架）
     */
    private Integer status;

    /**
     * 是否含规格图片（0否1是）
     */
    private Integer hasSpecPic;

    /**
     * 是否立即上架（0否1是）
     */
    private Integer isUp;

    /**
     * 上架时间
     */
    private Date upDate;

    /**
     * 下架时间
     */
    private Date offDate;

    /**
     * 是否上架APP（0否1是）
     */
    private Integer isApp;

    /**
     * 是否上架小程序（0否1是）
     */
    private Integer isMini;

    /**
     * 是否上架web（0否1是）
     */
    private Integer isWeb;

    /**
     * 是否首页推荐（0否1是）
     */
    private Integer isFirstPage;

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
     * 最高价（规格中销售价最高价）
     */
    private Integer maxPrice;

    /**
     * 最低价（规格中销售价最低价）
     */
    private Integer minPrice;

    /**
     * 最高价（规格中市场价最高价）
     */
    private Integer maxMarketPrice;

    /**
     * 最低价（规格中市场价最低价）
     */
    private Integer minMarketPrice;

    /**
     * 总库存
     */
    private Integer totalStock;

    /**
     * 单位名称
     */
    private String unit;

    /**
     * 销量
     */
    private Integer saleNum;

    /**
     * 标签图片
     */
    private String picFileId;

    /**
     * 图片路径
     */
    private String picFilePath;

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
