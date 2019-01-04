package com.practice.controller;

import com.practice.aop.RestFilter;
import com.practice.bean.Student;
import com.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    public Student getById(HttpServletRequest request){

        int id = Integer.valueOf(request.getParameter("id"));
        return studentService.getById(id);

    }

}
