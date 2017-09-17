package com.renren.demo.sys.service.impl;

import com.renren.demo.sys.entity.SysUser;
import com.renren.demo.sys.service.SysUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zangchuanjun
 * @email 625790215@qq.com
 * @date 2017年09月17日 下午10:17:48
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Override
    public List<String> queryAllPerms(Long id) {
        return null;
    }

    @Override
    public SysUser queryByUserName(String name) {
        return null;
    }
}
