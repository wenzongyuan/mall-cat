package com.wzy.mallcat.dao.service.impl;

import com.wzy.mallcat.dao.entity.Trade;
import com.wzy.mallcat.dao.mapper.TradeMapper;
import com.wzy.mallcat.dao.service.ITradeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 交易单 服务实现类
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Service
public class TradeServiceImpl extends ServiceImpl<TradeMapper, Trade> implements ITradeService {

}
