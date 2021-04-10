package com.yc;

import com.yc.biz.StudentBiz;
import com.yc.biz.StudentBizImpl;

/**
 * @program: testSpring
 * @description:
 * @author: Erebus
 * @create: 2021-04-10 19:32
 */
public class Test {
    public static void main(String[] args) {
        StudentBiz target=new StudentBizImpl();

        LogAspect la=new LogAspect(target);
        Object obj=la.createProxy();//obj是代理对象

        if(obj instanceof  StudentBiz){
            StudentBiz sb= (StudentBiz) obj;
            sb.find("张三");
            sb.add("李四");
            sb.update("王五");
        }
    }
}
