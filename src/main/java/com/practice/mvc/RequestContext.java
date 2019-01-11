package com.practice.mvc;

import java.lang.annotation.*;

/**
 * @author jinmeng on 2019/1/11.
 * @version 1.0
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestContext {

    String value() default "";

}