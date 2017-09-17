package com.renren.demo.common.exception;

/**
 * @author zangchuanjun
 * @email 625790215@qq.com
 * @date 2017年09月17日 下午16:11:01
 */
public class RRException extends RuntimeException {
    private static String msg;
    private static int code;

    public RRException(String msg){
        super(msg);
        this.msg=msg;
    }

    public RRException(String msg,Throwable e){
        super(msg,e);
        this.msg=msg;
    }

    public RRException(String msg,int code){
        super(msg);
        this.msg=msg;
        this.code=code;
    }

    public static String getMsg() {
        return msg;
    }

    public static void setMsg(String msg) {
        RRException.msg = msg;
    }

    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        RRException.code = code;
    }
}
