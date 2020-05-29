package com.springaop.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by wendyhe on 2018/10/9.
 * 切面类  含有多个通知
 */

@Component
@Aspect
public class MyAspect {

    //切入点当前有效
    //@Before("execution(* com.springaop.anno.UserServiceImpl.*(..))")
    public void myBefore(JoinPoint joinPoint){

        System.out.println("前置通知: "+joinPoint.getSignature().getName());
    }


    //声明公共的切入点表达式
//    @Pointcut("execution(* com.springaop.anno.UserServiceImpl.*(..))")
//    private  void  myPointCut(){
//    }
    //@AfterReturning(value = "execution(* com.springaop.anno.UserServiceImpl.*(..))",returning = "ret")
    public void myAfterReturning(JoinPoint joinPoint, Object ret){

        System.out.println("后置通知: "+joinPoint.getSignature().getName()+", - - >"+ret);
    }


    //@Around(value = "execution(* com.springaop.anno.UserServiceImpl.*(..))")
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{

        System.out.println("前 --> 环绕通知");

        //手动执行目标方法
        Object obj = joinPoint.proceed();

        System.out.println("后 --> 环绕通知");
        return obj;
    }


    //@AfterThrowing(value = "execution(* com.springaop.anno.UserServiceImpl.*(..))",throwing ="e")
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e){

        System.out.println("抛出异常通知"+e.getMessage());

    }

    @After("execution(* com.springaop.anno.UserServiceImpl.*(..))")
    public void myAfter(JoinPoint joinPoint){

        System.out.println("最终通知");

    }



}
