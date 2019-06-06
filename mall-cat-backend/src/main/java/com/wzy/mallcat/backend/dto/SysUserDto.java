package com.wzy.mallcat.backend.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/**
* @Description:    系统管理员对接实例
* @Author:         Wen
* @CreateDate:     2019/5/29 17:09
* @UpdateUser:     Wen
* @UpdateDate:     2019/5/29 17:09
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysUserDto implements Serializable {
    /**
     * 管理员id
     */

    private Long id;

    /**
     * 登录名
     */
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
