package com.practice.aop;


import com.practice.bean.ServiceResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jinmeng on 2018/9/27.
 * @version 1.0
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {



    @ResponseBody
    @ExceptionHandler(Throwable.class)
    public ServiceResult handleALLException(HttpServletRequest request, HttpServletResponse response,
                                         Throwable e) {

        log.error(e.getMessage());
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.setMsg(e.getMessage());
        serviceResult.setCode(ServiceResult.SERVER_ERROR);
        return serviceResult;

    }






}