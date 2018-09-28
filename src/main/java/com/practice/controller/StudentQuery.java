package com.practice.controller;

import com.practice.bean.Student;
import com.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: jinmeng
 * Date: 2017-04-27
 * Time: 16:14
 */
@Controller
@RequestMapping("/example")
public class StudentQuery {

    @Autowired
    StudentService studentService;

    @RequestMapping("/student")
    public @ResponseBody Student getById(HttpServletRequest request){

        int id = Integer.valueOf(request.getParameter("id"));
        return studentService.getById(id);

    }

}
