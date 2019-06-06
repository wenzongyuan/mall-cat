package com.wzy.mallcat.dao.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysMenu extends Model<SysMenu> {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单id
     */
    private Long id;

    /**
     * 一级父级菜单id
     */
    private Long parentId;

    /**
     * 所有父级id
     */
    private String parentIds;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单类型 (0:菜单  1:按钮)
     */
    private Integer type;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 菜单唯一标识
     */
    private String unioMark;

    /**
     * 图标
     */
    private String iconUrl;

    /**
     * 链接
     */
    private String href;

    /**
     * 是否在菜单中显示
     */
    private Integer isShow;

    /**
     * 创建者
     */
    private Long createBy;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

    /**
     * 更新者
     */
    private Long updateBy;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;

    /**
     * 备注信息
     */
    private String remarks;

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
