package com.practice.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.practice.aop.RestFilter;
import com.practice.bean.ServiceResult;
import com.practice.bean.Student;
import com.practice.mvc.GeneralRequestContext;
import com.practice.mvc.RequestContext;
import com.practice.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: jinmeng
 * Date: 2017-04-27
 * Time: 16:14
 */
@RestController
@RequestMapping("/request")
@Slf4j
public class RequestContextController {


    @RequestMapping("/context")
    public ServiceResult getById(@RequestContext GeneralRequestContext  context){

        log.info(JSON.toJSONString(context));

        return new ServiceResult.Builder()
                .code(ServiceResult.SUCCESS)
                .msg("请求处理成功")
                .data(context)
                .build();
    }



}
