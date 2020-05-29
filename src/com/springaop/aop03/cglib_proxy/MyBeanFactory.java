package com.springaop.aop03.cglib_proxy;



import com.springaop.aop03.cglib_proxy.UserServiceImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by wendyhe on 2018/10/5.
 */
public class MyBeanFactory {

    public static UserServiceImpl createService(){

        //1 目标类
        UserServiceImpl userService = new UserServiceImpl();
        //2 切面类
        MyAspect myAspect = new MyAspect();

        //3 代理类  采用cglib 底层创建目标类的子类
        //3.1 核心类
        Enhancer enhancer = new Enhancer();
        //3.2 确定父类
        enhancer.setSuperclass(userService.getClass());

        /** 3.3 设置回调函数  MethodInterceptor()接口等效于jdk中的InvocationHandler()接口
         *      intercept() 等效于jdk中的 invoke()
         *      参数1 2 3 与invoke() 参数一致
         *      参数4：MethodProxy methodProxy方法代理
         *
         */

        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

                //前置通知
                myAspect.before();

                //执行目标类的方法
                //Object obj = method.invoke(userService,args);
                //执行代理类的父类  就是执行目标类（目标类和代理类  父子关系）
                Object obj = methodProxy.invokeSuper(proxy,args);

                //后置通知
                myAspect.after();

                return obj;
            }
        });

        //3.4 创建代理
        UserServiceImpl proxyService = (UserServiceImpl) enhancer.create();
        return  proxyService;





    }
}
