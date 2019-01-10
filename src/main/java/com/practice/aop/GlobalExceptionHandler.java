package com.practice.aop;


import com.dianping.cat.Cat;
import com.practice.bean.ServiceResult;
import com.practice.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

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

        log.error(e.getStackTrace().toString());
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.setMsg(e.getMessage());
        serviceResult.setCode(ServiceResult.SERVER_ERROR);
        return serviceResult;

    }






}