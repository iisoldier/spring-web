package com.practice.bean;

import java.io.Serializable;

/**
 * @author jinmeng on 2018/9/26.
 * @version 1.0
 */
public class ServiceResult implements Serializable{

    public static final Integer SUCCESS = 200;
    public static final Integer BIZ_ERROR = 400;
    public static final Integer SERVER_ERROR = 500;

    private Integer code;
    private String msg;
    private Object data;

    public ServiceResult(){
        code = SUCCESS;
    }

    private ServiceResult(Builder builder) {
        this.code = builder.code;
        this.msg = builder.msg;
        this.data = builder.data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }


    public static class Builder {
        private Integer code;
        private String msg;
        private Object data;

        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        public Builder fromPrototype(ServiceResult prototype) {
            code = prototype.code;
            msg = prototype.msg;
            data = prototype.data;
            return this;
        }

        public ServiceResult build() {
            return new ServiceResult(this);
        }
    }
}
