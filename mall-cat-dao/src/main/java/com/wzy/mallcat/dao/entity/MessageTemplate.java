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
 * 
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MessageTemplate extends Model<MessageTemplate> {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 内容
     */
    private String content;

    /**
     * 模版类型(1微信，2短信，3邮件)
     */
    private Integer type;

    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

    private Long createBy;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;

    private Long updateBy;

    @TableLogic
    private Integer delFlag;

    private String theme;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
