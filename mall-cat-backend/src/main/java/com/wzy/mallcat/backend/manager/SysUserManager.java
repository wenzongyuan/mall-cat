package com.wzy.mallcat.backend.manager;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wzy.mallcat.backend.dto.SysUserDto;
import com.wzy.mallcat.dubboapi.sysuser.IDubboSysUserService;
import com.wzy.mallcat.dubboapi.sysuser.bo.SysUserBo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
* @Description:    管理员用户管理器
* @Author:         Wen
* @CreateDate:     2019/5/29 17:07
* @UpdateUser:     Wen
* @UpdateDate:     2019/5/29 17:07
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class SysUserManager {

    @Reference
    private IDubboSysUserService dubboSysUserService;

    public boolean saveSysUser(SysUserDto sysUserDto){

        boolean success = false;

        if (sysUserDto != null ){

            SysUserBo sysUserBo = new SysUserBo();

            BeanUtils.copyProperties(sysUserDto, sysUserBo);

            success = dubboSysUserService.saveSysUser(sysUserBo);
        }

        return success;
    }
}
