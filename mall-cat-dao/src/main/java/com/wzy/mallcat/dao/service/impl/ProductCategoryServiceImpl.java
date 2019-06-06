package com.wzy.mallcat.dao.service.impl;

import com.wzy.mallcat.dao.entity.ProductCategory;
import com.wzy.mallcat.dao.mapper.ProductCategoryMapper;
import com.wzy.mallcat.dao.service.IProductCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 类目表 服务实现类
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements IProductCategoryService {

}
