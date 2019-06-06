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
 * 消息发送日志
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MessageSendLog extends Model<MessageSendLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 消息id
     */
    private String messageId;

    /**
     * 消息key
     */
    private String messageKey;

    /**
     * 消息标签
     */
    private String messageTag;

    /**
     * 消息标题
     */
    private String messageTopic;

    /**
     * 消息内容
     */
    private String messageBody;

    /**
     * 是否状态 1 发送 0 不发送
     */
    private String sendStatus;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
