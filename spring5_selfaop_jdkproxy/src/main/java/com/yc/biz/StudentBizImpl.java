package com.yc.biz;

/**
 * @program: testSpring
 * @description:
 * @author: Erebus
 * @create: 2021-04-10 19:20
 */
public class StudentBizImpl implements  StudentBiz{
    @Override
    public int add(String name) {
        System.out.println("调用Add："+name);
        return 100;
    }

    @Override
    public void update(String name) {
        System.out.println("调用Update："+name);

    }

    @Override
    public String find(String name) {
        System.out.println("调用Find："+name);

        return name+"===";
    }
}
