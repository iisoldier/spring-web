package com.practice.controller;

import com.alibaba.fastjson.JSON;
import com.practice.bean.ServiceResult;
import com.practice.mvc.GeneralRequestContext;
import com.practice.mvc.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
