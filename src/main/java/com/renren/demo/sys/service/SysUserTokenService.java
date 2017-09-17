package com.renren.demo.sys.service;

import com.renren.demo.common.utils.R;

/**
 * @author zangchuanjun
 * @email 625790215@qq.com
 * @date 2017年09月17日 下午12:06:15
 */
public interface SysUserTokenService {
    /**
     * 生成token
     * @param userId
     * @return
     */
    public R createToken(long userId);
}
