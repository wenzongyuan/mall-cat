package com.wzy.mallcat.dao.service.impl;

import com.wzy.mallcat.dao.entity.MemberInfo;
import com.wzy.mallcat.dao.mapper.MemberInfoMapper;
import com.wzy.mallcat.dao.service.IMemberInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员信息基础表 服务实现类
 * </p>
 *
 * @author Wen
 * @since 2019-05-27
 */
@Service
public class MemberInfoServiceImpl extends ServiceImpl<MemberInfoMapper, MemberInfo> implements IMemberInfoService {

}
