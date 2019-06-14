package com.wzy.mallcat.dubboapi.admin.bo;

import com.wzy.mallcat.dubboapi.admin.IDubboSysUserService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysUserBo implements Serializable {
    /**
     * 管理员id
     */

    @NotNull(groups = IDubboSysUserService.UpdateSysUser.class)
    private Long id;

    /**
     * 登录名
     */
    @Size(min = 1, max = 32,
    groups = {IDubboSysUserService.SaveSysUser.class,
              IDubboSysUserService.UpdateSysUser.class})
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 用户头像
     */
    private String photoPath;

    /**
     * 是否可登录(0不可，1可登录)
     */
    private Integer loginFlag;

    /**
     * 备注信息
     */
    private String remarks;

}
