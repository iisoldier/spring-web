package com.practice.repo.dao;

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
public interface DynamicStudentDao {

    String tableName = "Student";


    /**
     * 根据id获取学生信息 另一种实现形式
     * @param id
     * @return
     */
    @SelectProvider(type = DynamicSelectProvider.class,method = "selectByPK")
    Map<String,Object> get(@Param("id") Integer id);










}
