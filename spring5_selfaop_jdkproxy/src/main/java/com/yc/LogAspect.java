package com.yc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @program: testSpring
 * @description:
 * @author: Erebus
 * @create: 2021-04-10 19:21
 */
public class LogAspect implements InvocationHandler {

    private Object target;//目标类对象

    public LogAspect(Object target){
        this.target=target;
    }

    public Object createProxy(){//创建一个代理实例
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类对象:"+proxy.getClass());
        System.out.println("目标类方法:"+method);
        System.out.println("方法中参数:"+args);

        //前置增强

        if(method.getName().startsWith("add")){//转换成切入点表达式的解析
            log();
        }

        Object returnValue=method.invoke(this.target,args);//相当于直接执行了StudentBizImpl中的find（）
        //后置增强


        return returnValue;
    }

    private void log() {
        System.out.println("======增强前======");
        System.out.println("现在是:"+new Date());
        System.out.println("===========");
    }
}
