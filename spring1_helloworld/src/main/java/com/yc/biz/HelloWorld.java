package com.yc.biz;

import org.springframework.stereotype.Component;

/**
 * @program: testSpring
 * @description:
 * @author: Erebus
 * @create: 2021-04-04 15:26
 */
@Component
public class HelloWorld {
    public HelloWorld(){
        System.out.println("无参的构造方法");
    }
    public void hello(){
        System.out.println("HelloWorld");
    }
}
