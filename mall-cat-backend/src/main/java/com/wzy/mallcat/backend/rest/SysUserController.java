package com.wzy.mallcat.backend.rest;

import com.wzy.mallcat.backend.dto.SysUserDto;
import com.wzy.mallcat.backend.manager.SysUserManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("sysUser")
public class SysUserController {

    @Resource
    private SysUserManager sysUserManager;

    @RequestMapping("saveSysUser")
    public boolean saveSysUser(@RequestBody SysUserDto sysUserDto){

        return sysUserManager.saveSysUser(sysUserDto);
    }

}
