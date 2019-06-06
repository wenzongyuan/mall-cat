package com.wzy.mallcat.dao.service.impl;

import com.wzy.mallcat.dao.entity.SysCode;
import com.wzy.mallcat.dao.mapper.SysCodeMapper;
import com.wzy.mallcat.dao.service.ISysCodeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统相同业务生成唯一编号工具表 服务实现类
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Service
public class SysCodeServiceImpl extends ServiceImpl<SysCodeMapper, SysCode> implements ISysCodeService {

}
