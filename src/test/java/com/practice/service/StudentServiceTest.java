package com.practice.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.practice.bean.Student;
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


    @Test
    public void testJSON() throws Exception{

        String json = "{\"glossary\":{\"title\":\"example glossary\",\"GlossDiv\":{\"title\":\"S\",\"GlossList\":{\"GlossEntry\":{\"ID\":\"SGML\",\"SortAs\":\"SGML\",\"GlossTerm\":\"Standard Generalized Markup Language\",\"Acronym\":\"SGML\",\"Abbrev\":\"ISO 8879:1986\",\"GlossDef\":{\"para\":\"A meta-markup language, used to create markup languages such as DocBook.\",\"GlossSeeAlso\":[\"GML\",\"XML\"]},\"GlossSee\":\"markup\"}}}}}";
        JSONObject jsonObject = JSON.parseObject(json);
        System.out.println(json);
        System.out.println(jsonObject);
    }
}
