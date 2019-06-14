package com.wzy.mallcat.admin.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzy.mallcat.dao.entity.SysUser;
import com.wzy.mallcat.dao.service.ISysUserService;
import com.wzy.mallcat.dubboapi.admin.IDubboSysUserService;
import com.wzy.mallcat.dubboapi.admin.bo.SysUserBo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
* @Description:    系统用户dubbo服务实现
* @Author:         Wen
* @CreateDate:     2019/5/29 15:34
* @UpdateUser:     Wen
* @UpdateDate:     2019/5/29 15:34
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Component
@Service
@Slf4j
public class DubboSysUserService implements IDubboSysUserService {

    @Resource
    private ISysUserService sysUserService;

    @Override
    public boolean saveSysUser(SysUserBo sysUserBo) {

        boolean success = false;

        if (sysUserBo != null){

            SysUser sysUser = new SysUser();

            BeanUtils.copyProperties(sysUserBo, sysUser, SysUser.class);

            success = sysUserService.save(sysUser);

        }

        return success;
    }


    @Override
    public boolean updateSysUser(SysUserBo sysUserBo) {
        return false;
    }
}
