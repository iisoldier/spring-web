package com.practice.aop;

import java.lang.annotation.*;

/**
 * @author jinmeng on 2018/9/27.
 * @version 1.0
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface RestFilter {

}
