package com.practice.controller;

import com.alibaba.fastjson.JSONObject;
import com.practice.aop.RestFilter;
import com.practice.bean.Student;
import com.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: jinmeng
 * Date: 2017-04-27
 * Time: 16:14
 */
@RestController
@RequestMapping("/example")
public class QueryWithDao {

    @Autowired
    StudentService studentService;

    @RequestMapping("/student")
    @RestFilter
    public Student getById(HttpServletRequest request, @RequestParam Integer id){


        if(id == 13){
            throw new NullPointerException();
        }
        return studentService.getById(id);

    }

    @RequestMapping(value = "/student/post",method = RequestMethod.POST)
    @RestFilter
    public Student getById(HttpServletRequest request, @RequestBody JSONObject jsonObject){

        Integer id = jsonObject.getInteger("id");
        if(id == null){
            return null;
        }
        return studentService.getById(id);

    }

}
