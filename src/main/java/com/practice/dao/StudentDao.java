package com.practice.dao;

import com.practice.bean.Student;
import com.practice.repo.provider.DynamicSelectProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.Map;

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
    Student getById(int id);




}
