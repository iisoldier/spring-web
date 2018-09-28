package com.practice.aop;

import com.alibaba.fastjson.JSON;
import com.dianping.shopping.admin.mvc.beauty.model.ServiceResult;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author jinmeng on 2018/9/27.
 * @version 1.0
 */
@ControllerAdvice
public class RestFilterAdvice implements ResponseBodyAdvice {


    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return methodParameter.hasMethodAnnotation(RestFilter.class);
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {

        ServiceResult serviceResult = new ServiceResult();
        if(!(o instanceof ServiceResult)){
            serviceResult.setCode(ServiceResult.SUCCESS);
            serviceResult.setData(o);
        }
        return JSON.toJSONString(serviceResult);
    }
}
