package com.practice.controller;

import com.practice.aop.RestFilter;
import com.practice.bean.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jinmeng on 2018/9/28.
 * @version 1.0
 */
@RestController
@RequestMapping("/custom")
public class CustomController {

    @RequestMapping("/student")
    @RestFilter
    public Student getById(HttpServletRequest request){

        Student student = new Student();
        student.setId(1);
        student.setAge(18);
        student.setName("Bob");
        return  student;
    }
}
