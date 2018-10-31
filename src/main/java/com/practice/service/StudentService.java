package com.practice.service;

/**
 * Author: jinmeng
 * Date: 2017-05-02
 * Time: 20:59
 */

import com.practice.bean.Student;
import com.practice.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public Student getById(int id){



        Student stu = studentDao.getById(id);
        return stu;
    }


}
