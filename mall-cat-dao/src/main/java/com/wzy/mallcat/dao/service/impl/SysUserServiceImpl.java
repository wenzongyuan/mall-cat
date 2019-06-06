package com.wzy.mallcat.dao.service.impl;

import com.wzy.mallcat.dao.entity.SysUser;
import com.wzy.mallcat.dao.mapper.SysUserMapper;
import com.wzy.mallcat.dao.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台管理用户表 服务实现类
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
