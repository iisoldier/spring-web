package com.practice.aop;


import com.practice.bean.ServiceResult;
import com.practice.exception.BizException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

/**
 * @author jinmeng on 2018/9/27.
 * @version 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /** Provides handling for exceptions throughout this service. */

    @ExceptionHandler({ BizException.class})
    @ResponseBody
    public final ServiceResult handleException(Exception ex, WebRequest request) {

        return new ServiceResult.Builder().code(ServiceResult.SERVER_ERROR).msg(ex.getMessage()).build();
    }


}