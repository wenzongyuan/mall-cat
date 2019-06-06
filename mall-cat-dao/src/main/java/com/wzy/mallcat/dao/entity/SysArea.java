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
 * 城市区域通用表
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysArea extends Model<SysArea> {

    private static final long serialVersionUID = 1L;

    /**
     * 城市区域ID
     */
    private Long id;

    /**
     * 父类目ID
     */
    private Long parentId;

    /**
     * 类目路径
     */
    private String parentIds;

    /**
     * 是否是父类目，0为否，1为是
     */
    private Integer isParent;

    /**
     * 城市区域名称
     */
    private String name;

    /**
     * 类目排序
     */
    private Integer sort;

    /**
     * 区域类型，1为国家；2为省/直辖市；3为地级市；4为区/县；
     */
    private Integer type;

    /**
     * 数据记录状态，0为废弃，1为有效，2为进入回收站
     */
    @TableLogic
    private Integer delFlag;

    /**
     * 记录创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

    /**
     * 记录最后更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;

    private String remark;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
