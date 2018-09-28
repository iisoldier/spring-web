package com.practice.exception;

/**
 * @author jinmeng on 2018/9/27.
 * @version 1.0
 */
public class BizException extends RuntimeException{


    private String code;

    private String message;


    public BizException(String message){
        this.message = message;

    }

    public BizException(String code, String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BizException{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
