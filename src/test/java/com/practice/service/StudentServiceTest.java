package com.practice.service;

import com.practice.bean.Student;
import com.practice.dao.StudentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author jinmeng on 2017/9/13.
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-context.xml"})
public class StudentServiceTest {

    @Autowired
    StudentService studentService;

    @Test
    public void testGetById() throws Exception{
        int id = 1;
        Student student = studentService.getById(id);
        System.out.println(student);
    }
}
