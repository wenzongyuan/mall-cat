package com.wzy.mallcat.admin.service;

import com.wzy.mallcat.dao.entity.SysUser;
import com.wzy.mallcat.dubboapi.sysuser.IDubboSysUserService;
import com.wzy.mallcat.dubboapi.sysuser.bo.SysUserBo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("dev")
public class UserServiceTest {

    @Resource
    private IDubboSysUserService userService;
    @Test
    public void saveUser() {

        SysUserBo sysUser = new SysUserBo();
        sysUser.setEmail("sssssss");

        userService.saveSysUser(sysUser);

        System.out.println(222222);
    }
}