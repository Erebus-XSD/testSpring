package yc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: testSpring
 * @description:
 * @author: Erebus
 * @create: 2021-04-10 19:00
 */
@Aspect
@Component //IOC注解 以实现Spring托管
@Order(value=1)
public class LogAspect3 {
    @Around("execution(* yc.biz.StudentBizImpl.find*(..))")
    public Object compute(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("====compute2====进到增强");
        long start=System.currentTimeMillis();
        Object retVal=pjp.proceed();
        long end=System.currentTimeMillis();
        System.out.println("====compute2要退出增强了");
        System.out.println("========这个方法运行时长为:"+(end-start));
        return retVal;
    }
}
