package com.yc;

import com.yc.biz.StudentBizImpl;

/**
 * @program: testSpring
 * @description:
 * @author: Erebus
 * @create: 2021-04-10 19:32
 */
public class Test {
    public static void main(String[] args) {
        StudentBizImpl sbi=new StudentBizImpl();
        LogAspect la=new LogAspect(sbi);
        Object obj=la.createProxy();//obj是代理对象

        if(obj instanceof  StudentBizImpl){
            StudentBizImpl sb= (StudentBizImpl) obj;
            sb.find("张三");
            sb.add("李四");
            sb.update("王五");
        }
    }
}
