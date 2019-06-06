package com.wzy.mallcat.dao.service.impl;

import com.wzy.mallcat.dao.entity.MessageSendLog;
import com.wzy.mallcat.dao.mapper.MessageSendLogMapper;
import com.wzy.mallcat.dao.service.IMessageSendLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消息发送日志 服务实现类
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Service
public class MessageSendLogServiceImpl extends ServiceImpl<MessageSendLogMapper, MessageSendLog> implements IMessageSendLogService {

}
