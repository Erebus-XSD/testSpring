package com.yc.dao;

import com.yc.Appconfig;
import com.yc.biz.StudentBizImpl;
import junit.framework.TestCase;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: testSpring
 * @description:
 * @author: Erebus
 * @create: 2021-04-04 14:55
 */
public class StudentDaoTest extends TestCase {
    private ApplicationContext ac;


  //  private StudentDao studentDao;
    //private StudentBizImpl studentBizImpl;

    @Override
    @Before
    public void setUp() throws Exception{
//        studentDao = new StudentDaoJpaImpl();
//        studentBizImpl = new StudentBizImpl();
//        studentBizImpl.setStudentDao(studentDao);
        ac=new AnnotationConfigApplicationContext(Appconfig.class);
    }

//    public void testAdd() {
//        StudentDao sD= (StudentDao) ac.getBean("studentDaoJpaImpl");
//        sD.add("Erebus01");
//
//    }
//
//   public void testUpdate() {
//        StudentDao sD= (StudentDao) ac.getBean("studentDaoMybatisImpl");
//        sD.update("Erebus02");
//        //studentDao.update("Ere");
//    }

    public void testBizAdd(){
        StudentBizImpl sD= (StudentBizImpl) ac.getBean("studentBizImpl");
        sD.add("Erebus03");
        //studentBizImpl.add("Melantha");
    }

}
