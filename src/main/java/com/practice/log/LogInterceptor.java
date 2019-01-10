package com.practice.log;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author jinmeng on 2017/9/13.
 * @version 1.0
 */
@Aspect
@Component
public class LogInterceptor {

    private static Logger logger = LoggerFactory.getLogger(LogInterceptor.class);

    @Pointcut("execution(* com.practice.service.*.*(..))")
    private void actionMethod() {
    }

    @Around("actionMethod()")
    public Object interceptor(ProceedingJoinPoint pjp) throws Throwable {

        Object proceed = pjp.proceed();
        logger.warn("Aop logger is ok,log whatever you want");
        System.out.println(pjp.getSignature().getDeclaringType().getSimpleName());
        System.out.println( pjp.getSignature().getName());
        return proceed;
    }

}
