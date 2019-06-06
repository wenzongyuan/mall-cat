package com.wzy.mallcat.dao.service.impl;

import com.wzy.mallcat.dao.entity.ProductSpec;
import com.wzy.mallcat.dao.mapper.ProductSpecMapper;
import com.wzy.mallcat.dao.service.IProductSpecService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 规格属性表 服务实现类
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Service
public class ProductSpecServiceImpl extends ServiceImpl<ProductSpecMapper, ProductSpec> implements IProductSpecService {

}
