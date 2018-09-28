package com.practice.dao;

import com.practice.bean.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 * Author: jinmeng
 * Date: 2017-05-02
 * Time: 21:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-context.xml"})
public class StudentDaoTest {

    @Autowired
    StudentDao studentDao;

    @Test
    public void testGetById() throws Exception{
        int id = 1;
        Student student = studentDao.getById(id);
        System.out.println(student);
    }



}
