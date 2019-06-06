package com.wzy.mallcat.dao.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统相同业务生成唯一编号工具表
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysCode extends Model<SysCode> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 编号类型（如订单编号，商品编号，有调用者传，库表中没有的时候会添加一个）
     */
    private String type;

    /**
     * 编号值，为递增，用于生产字符编号
     */
    private Integer value;

    /**
     * 日期用于判断重置value
     */
    private String date;

    /**
     * 是否需要重置不同（0：不需要重置 1：需要重置）
     */
    private Integer isReset;

    /**
     * 删除标记
     */
    @TableLogic
    private Integer delFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
