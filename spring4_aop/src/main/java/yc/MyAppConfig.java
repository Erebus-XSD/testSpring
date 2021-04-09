package yc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"yc"})
@EnableAspectJAutoProxy//启用aspectJ支持
public class MyAppConfig {








//    @MyBean
//    public HelloWorld hw() {      //method.invoke(  MyAppConfig对象 , xxx  )
//        return new HelloWorld();
//    }
//
//    @MyBean
//    public HelloWorld hw2() {      //method.invoke(  MyAppConfig对象 , xxx  )
//        return new HelloWorld();
//    }

}
