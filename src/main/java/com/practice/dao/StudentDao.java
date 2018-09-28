package com.practice.dao;

import com.practice.bean.Student;
import org.springframework.stereotype.Repository;

/**
 * Author: jinmeng
 * Date: 2017-04-27
 * Time: 19:35
 */
@Repository
public interface StudentDao {

    /**
     * 根据id获取学生信息
     * @param id
     * @return
     */
    public Student getById(int id);


}
