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
 * 商品修改日志表
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ProductPic extends Model<ProductPic> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 图片类型（1轮播2详情）
     */
    private Integer type;

    /**
     * 标签图片
     */
    private String picFileId;

    /**
     * 图片路径
     */
    private String picFilePath;

    /**
     * 是否为主图（0否1是）
     */
    private Integer isMain;

    /**
     * 排序越小越靠前
     */
    private Integer order;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
