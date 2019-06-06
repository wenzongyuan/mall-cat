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
 * 商品规格关系表
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ProductSpecRelation extends Model<ProductSpecRelation> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品SKU ID
     */
    private Long pdtId;

    /**
     * 规格ID
     */
    private Long specId;

    /**
     * 规格名称
     */
    private String specName;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 商品属性值
     */
    private String aliases;

    /**
     * 商品规格图片
     */
    private String picFileId;

    /**
     * 图片路径
     */
    private String picFilePath;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
