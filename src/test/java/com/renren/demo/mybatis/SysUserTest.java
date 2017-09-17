package com.renren.demo.mybatis;

import com.renren.demo.DemoApplication;
import com.renren.demo.sys.dao.SysUserMapper;
import com.renren.demo.sys.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zangchuanjun
 * @email 625790215@qq.com
 * @date 2017年09月17日 下午10:06:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class SysUserTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void selectByPrimaryKey(){
       SysUser user= sysUserMapper.selectByPrimaryKey(1L);
        System.out.println(user.getUsername());
    }
}
