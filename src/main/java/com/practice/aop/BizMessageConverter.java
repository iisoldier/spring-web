package com.practice.aop;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.practice.bean.ServiceResult;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;

/**
 * @author jinmeng on 2018/9/28.
 * @version 1.0
 */
public class BizMessageConverter extends FastJsonHttpMessageConverter {

    @Override
    protected void writeInternal(Object obj, HttpOutputMessage outputMessage) throws IOException,
            HttpMessageNotWritableException {

        ServiceResult serviceResult = new ServiceResult();
        if(!(obj instanceof ServiceResult)){
            serviceResult.setCode(ServiceResult.SUCCESS);
            serviceResult.setData(obj);
            obj = serviceResult;
        }

        super.writeInternal(obj,outputMessage);
    }

}
