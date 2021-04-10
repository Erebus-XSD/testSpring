package com.yc;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @program: testSpring
 * @description:
 * @author: Erebus
 * @create: 2021-04-10 19:21
 */
public class LogAspect implements MethodInterceptor {
    private Object target;//目标类对象

    public LogAspect(Object target){
        this.target=target;
    }

    public Object createProxy(){//创建一个代理实例
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }




    private void log() {
        System.out.println("======增强前======");
        System.out.println("现在是:"+new Date());
        System.out.println("===========");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if(method.getName().startsWith("add")){//转换成切入点表达式的解析
            log();
        }

        Object returnValue=method.invoke(this.target,args);//相当于直接执行了StudentBizImpl中的find（）
        //后置增强


        return returnValue;

    }
}
