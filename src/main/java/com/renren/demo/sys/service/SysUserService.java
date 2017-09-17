package com.renren.demo.sys.service;

import com.renren.demo.sys.entity.SysUser;

import java.util.List;

/**
 * @author zangchuanjun
 * @email 625790215@qq.com
 * @date 2017年09月17日 下午10:14:58
 */
public interface SysUserService {

    /**
     * 查询用户所有权限
     * @param id
     * @return
     */
    public List<String> queryAllPerms(Long id);

    /**
     * 根据用户名查询系统对象
     * @param name
     * @return
     */
    SysUser queryByUserName(String name);
}
