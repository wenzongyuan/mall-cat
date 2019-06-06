package com.wzy.mallcat.dubboapi.sysuser;

import com.wzy.mallcat.dubboapi.sysuser.bo.SysUserBo;

import javax.validation.GroupSequence;


/**
* @Description:    系统用户业务service
* @Author:         Wen
* @CreateDate:     2019/5/28 17:00
* @UpdateUser:     Wen
* @UpdateDate:     2019/5/28 17:00
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface IDubboSysUserService {


    /**
    * @Description:    添加系统用户
    * @Author:         Wen
    * @CreateDate:     2019/5/28 17:01
    * @UpdateUser:     Wen
    * @UpdateDate:     2019/5/28 17:01
    * @UpdateRemark:   修改内容
    * @Version:        1.0
    */
    @interface SaveSysUser{}
    boolean saveSysUser(SysUserBo sysUserBo);

    /**
    * @Description:    修改系统用户
    * @Author:         Wen
    * @CreateDate:     2019/5/28 17:02
    * @UpdateUser:     Wen
    * @UpdateDate:     2019/5/28 17:02
    * @UpdateRemark:   修改内容
    * @Version:        1.0
    */
    @interface UpdateSysUser{}
    boolean updateSysUser(SysUserBo sysUserBo);


}
