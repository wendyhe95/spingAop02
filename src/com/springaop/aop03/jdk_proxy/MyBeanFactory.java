package com.springaop.aop03.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wendyhe on 2018/10/5.
 */
public class MyBeanFactory {

    public static UserService createService(){

        //目标类
        UserService userService = new UserServiceImpl();

        //切面类
        MyAspect myAspect = new MyAspect();

        /**
         *  代理类,将目标类与切面类进行结合
         *  Proxy.newProxyInstance
         *      参数1：loader  类加载器，动态代理类  运行时创建， 任何类都需要类加载器将其加载到内存
         *              一般情况：当前类.class.getClassLoader();
         *                       目标类实例.class.getClassLoader();
         *      参数2：Class[] interfaces 代理类实现的所有接口
         *              方式1： 目标类实例.getClass().getInterfaces(); 只能获得自己的接口 不能获得父元素接口
         *              方式2：new Class[]{UserService.class}
         *      参数3：InvocationHandler 处理类，接口，必须进行实现类，一般为匿名内部类
         *          提供了invoke() 方法,3个参数
         *              Object proxy: 代理对象
         *              Method method: 代理对象当前执行的描述对象(反射)
         *                      执行方法名：method.getName()
         *                      执行方法：method.invoke()
         *              Object[] args: 方法实际参数
         *
         *
         */

        UserService proxyService = (UserService) Proxy.newProxyInstance(
                MyBeanFactory.class.getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        //前置通知
                        myAspect.before();

                        //执行目标类的方法
                        Object obj = method.invoke(userService,args);

                        //后置通知
                        myAspect.after();
                        return obj;


                    }
                });


        return proxyService;





    }
}