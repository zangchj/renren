package com.renren.demo.sys.oauth2;

import com.renren.demo.common.exception.RRException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * @author zangchuanjun
 * @email 625790215@qq.com
 * @date 2017年09月17日 下午15:22:35
 */
public class TokenGenerator {

    public static String generatorValue(){
        return generatorValue(UUID.randomUUID().toString());
    }

    private static final char[] hexCode="0123456789abcdef".toCharArray();

    public static String toHexString(byte[] data){
        if(data==null){
            return null;
        }
        StringBuilder builder=new StringBuilder(data.length*2);
        for (byte b:data) {
            builder.append(hexCode[b>>4&0xF]);
            builder.append(hexCode[b&0xF]);
        }
        return builder.toString();
    }

    public static String generatorValue(String param) {
        try{
            MessageDigest digest=MessageDigest.getInstance("MD5");
            digest.reset();
            digest.update(param.getBytes());

            byte[] messageDigest= digest.digest();
            return toHexString(messageDigest);
        }catch(Exception ex){
            throw new RRException("生成Token失败",ex);
        }


    }
}
