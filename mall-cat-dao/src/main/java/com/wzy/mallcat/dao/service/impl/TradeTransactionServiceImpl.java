package com.wzy.mallcat.dao.service.impl;

import com.wzy.mallcat.dao.entity.TradeTransaction;
import com.wzy.mallcat.dao.mapper.TradeTransactionMapper;
import com.wzy.mallcat.dao.service.ITradeTransactionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 交易支付单 服务实现类
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Service
public class TradeTransactionServiceImpl extends ServiceImpl<TradeTransactionMapper, TradeTransaction> implements ITradeTransactionService {

}
