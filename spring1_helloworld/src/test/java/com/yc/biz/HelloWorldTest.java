package com.yc.biz;

import com.yc.Appconfig;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: testSpring
 * @description:
 * @author: Erebus
 * @create: 2021-04-04 15:30
 */
public class HelloWorldTest extends TestCase {
    private ApplicationContext ac;

    @Override
    @Before
    public  void setUp(){
        ac=new AnnotationConfigApplicationContext(Appconfig.class);

    }

    @Test
    public void testHello(){
        HelloWorld hw= (HelloWorld) ac.getBean("helloWorld");
        hw.hello();
        HelloWorld hw2= (HelloWorld) ac.getBean("helloWorld");
        hw2.hello();
    }

}

