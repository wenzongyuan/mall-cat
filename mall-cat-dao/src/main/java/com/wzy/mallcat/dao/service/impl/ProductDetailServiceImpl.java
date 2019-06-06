package com.wzy.mallcat.dao.service.impl;

import com.wzy.mallcat.dao.entity.ProductDetail;
import com.wzy.mallcat.dao.mapper.ProductDetailMapper;
import com.wzy.mallcat.dao.service.IProductDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品SKU表 服务实现类
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Service
public class ProductDetailServiceImpl extends ServiceImpl<ProductDetailMapper, ProductDetail> implements IProductDetailService {

}
