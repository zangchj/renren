package com.renren.demo.sys.service.impl;

import com.renren.demo.common.utils.R;
import com.renren.demo.sys.dao.SysUserTokenMapper;
import com.renren.demo.sys.service.SysUserTokenService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zangchuanjun
 * @email 625790215@qq.com
 * @date 2017年09月17日 下午12:08:13
 */
public class SysUserTokenServiceImpl implements SysUserTokenService {

    @Autowired
    private SysUserTokenMapper sysUserTokenMapper;

    @Override
    public R createToken(long userId) {
        //TokenGenerator
        return null;
    }
}
