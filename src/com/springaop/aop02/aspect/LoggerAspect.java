package com.springaop.aop02.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by wendyhe on 2018/9/26.
 */


@Aspect
@Component
public class LoggerAspect {

    @Around(value = "execution(* com.springaop.aop02.service.ProductService.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start log");
        Object object = joinPoint.proceed();
        System.out.println("end log");
        return object;
    }
}
