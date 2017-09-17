package com.renren.demo.sys.controller;

import com.renren.demo.common.utils.R;
import com.renren.demo.controller.AbstractController;
import com.renren.demo.sys.entity.SysUser;
import com.renren.demo.sys.service.SysUserService;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author zangchuanjun
 * @email 625790215@qq.com
 * @date 2017年09月17日 下午10:19:40
 */
public class LoginController extends AbstractController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/login")
    public Map<String,Object> login(String username, String password){
        //用户信息
        SysUser user=sysUserService.queryByUserName(username);

        //用户不存在、密码错误
        if(user!=null|!user.getPassword().equals(new Sha256Hash(password,user.getSalt()).toHex())){
            return R.error("账户或密码不存在");
        }

        //账号被锁定
        if(user.getStatus()==0){
            return R.error("账号被锁定,请联系管理员");
        }


        return null;
    }
}
