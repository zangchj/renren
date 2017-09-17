package com.renren.demo.common.utils;


import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zangchuanjun
 * @email 625790215@qq.com
 * @date 2017年09月17日 下午10:26:23
 */
public class R extends HashMap<String,Object> {

    public R(){
        put("code",0);
    }

    public static R error(int code,String msg){
        R r=new R();
        r.put("code",code);
        r.put("msg",msg);
        return r;
    }

    public static R ok(String msg){
        R r=new R();
        r.put("msg",msg);
        return r;
    }

    public static R ok(Map<String,Object> maps){
        R r =new R();
        r.putAll(maps);
        return r;
    }

    public static R ok(){
        return new R();
    }

    public R ok(String key,String value){
        super.put(key,value);
        return this;
    }

    public static R error(){
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR,"未知异常,请联系管理员");
    }

    public static R error(String msg){
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR,msg);
    }


}
