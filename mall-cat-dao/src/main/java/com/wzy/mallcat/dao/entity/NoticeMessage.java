package com.wzy.mallcat.dao.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
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
public class NoticeMessage extends Model<NoticeMessage> {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 消息类型1短信2邮件
     */
    private Integer messageType;

    /**
     * 业务类型
     */
    private Integer businessType;

    /**
     * 内容
     */
    private String content;

    /**
     * 发送状态
     */
    private Integer status;

    /**
     * 发送时间
     */
    private Date sendTime;

    private String target;

    private String theme;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
