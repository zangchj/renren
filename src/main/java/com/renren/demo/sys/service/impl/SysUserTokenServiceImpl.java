package com.renren.demo.sys.service.impl;

import com.renren.demo.common.utils.R;
import com.renren.demo.sys.dao.SysUserTokenMapper;
import com.renren.demo.sys.entity.SysUserToken;
import com.renren.demo.sys.oauth2.TokenGenerator;
import com.renren.demo.sys.service.SysUserTokenService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author zangchuanjun
 * @email 625790215@qq.com
 * @date 2017年09月17日 下午12:08:13
 */
public class SysUserTokenServiceImpl implements SysUserTokenService {

    @Autowired
    private SysUserTokenMapper sysUserTokenMapper;

    //12小时后过期
    private static final int EXPIRE=3600*12;

    @Override
    public SysUserToken queryByUserId(Long userId) {
        return sysUserTokenMapper.selectByPrimaryKey(userId);
    }

    @Override
    public R createToken(long userId) {
        //生成一个token
        String token=TokenGenerator.generatorValue();

        //当前时间
        Date date=new Date();

        //过期时间
        Date expireDate=new Date(date.getTime()+EXPIRE*1000);

        SysUserToken tokenEntity=queryByUserId(userId);
        if(tokenEntity==null){
            tokenEntity=new SysUserToken();
            tokenEntity.setUserId(userId);
            tokenEntity.setToken(token);
            tokenEntity.setUpdateTime(date);
            tokenEntity.setExpireTime(expireDate);

            // 保存token
            save(tokenEntity);
        }
        else{
            tokenEntity.setToken(token);
            tokenEntity.setUpdateTime(date);
            tokenEntity.setExpireTime(expireDate);

            //更新token
            update(tokenEntity);

        }

        return null;
    }

    @Override
    public void save(SysUserToken token) {
        sysUserTokenMapper.insert(token);
    }

    @Override
    public void update(SysUserToken token) {
        sysUserTokenMapper.updateByPrimaryKey(token);
    }
}
