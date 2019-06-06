package com.wzy.mallcat.dao.service.impl;

import com.wzy.mallcat.dao.entity.ProductModifyLog;
import com.wzy.mallcat.dao.mapper.ProductModifyLogMapper;
import com.wzy.mallcat.dao.service.IProductModifyLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品修改日志表 服务实现类
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Service
public class ProductModifyLogServiceImpl extends ServiceImpl<ProductModifyLogMapper, ProductModifyLog> implements IProductModifyLogService {

}
