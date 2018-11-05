package com.practice.repo.provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.HashMap;

/**
 * @author jinmeng on 2018/11/5.
 * @version 1.0
 */
public class DynamicSelectProvider {

    public String selectByPK(final HashMap<String, Object> inputParam){

        Integer id = (Integer) inputParam.get("id");
        return new SQL() {{

            SELECT("*");
            FROM("student");
            WHERE("id" + " = " + id);
        }}.toString();
    }



}
