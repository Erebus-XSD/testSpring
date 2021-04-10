package yc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: testSpring
 * @description:日志切面类
 * @author: Erebus
 * @create: 2021-04-09 19:34
 */
@Aspect
@Component //IOC注解 以实现Spring托管
@Order(value=100)
public class LogAspect {

    @Around("execution(* yc.biz.StudentBizImpl.find*(..))")
    public Object compute(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("====compute====进到增强");
        long start=System.currentTimeMillis();
        Object retVal=pjp.proceed();
        long end=System.currentTimeMillis();
        System.out.println("====compute要退出增强了");
        System.out.println("========这个方法运行时长为:"+(end-start));
        return retVal;
    }
    //切入点的声明
    @Pointcut("execution(* yc.biz.StudentBizImpl.add*(..))")//add*指以add开头的方法
    private void add(){}//这个方法没有任何实际意义 仅仅是作为参照点的一个寄生体

    @Pointcut("execution(* yc.biz.StudentBizImpl.update*(..))")//update*指以update开头的方法
    private void update(){}//这个方法没有任何实际意义 仅仅是作为参照点的一个寄生体

    @Pointcut("add()||update()")//将上述两切入点同时运行
    private  void addAndUpdate(){ };

    //增加的声明
    @Before("yc.aspect.LogAspect.addAndUpdate()")
    public void log(){
        System.out.println("============前置增强的日志=============");
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dstr=sdf.format(d);
        System.out.println("执行的时间为:"+dstr);
        System.out.println("============前置增强的结束=============");

    }
}
