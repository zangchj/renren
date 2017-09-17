package com.renren.demo.sys.dao;

import com.renren.demo.sys.entity.SysUserToken;

public interface SysUserTokenMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(SysUserToken record);

    int insertSelective(SysUserToken record);

    SysUserToken selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(SysUserToken record);

    int updateByPrimaryKey(SysUserToken record);
}