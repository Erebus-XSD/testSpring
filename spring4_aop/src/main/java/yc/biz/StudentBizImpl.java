package yc.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yc.dao.StudentDao;

import java.util.Random;

/**
 * @program: testSpring
 * @description:
 * @author: Erebus
 * @create: 2021-04-04 14:49
 */
@Service
public class StudentBizImpl implements StudentBiz {
    private StudentDao studentDao;

    public StudentBizImpl(){}

    public StudentBizImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Autowired
    public void setStudentDao(StudentDao studentDao){
        this.studentDao=studentDao;
    }


    //依赖注入(DI)方法1：按名称注入
    //@MyResource(name = "studentDaoJpaImpl")
    //public void setStudentDao(StudentDao studentDao){
     //   this.studentDao=studentDao;
    //}

    //方法2
    //@Inject  //javax中的依赖注入，如果有多个对象 例如本模块中的JpaImpl与MybatisImpl）
               // 一定需要使用下面语句中的@Named("xxx")
    //    public void setStudentDao(@Named(studentDaoJpaImpl)StudentDao studentDao){
    //        this.studentDao=studentDao;
    //    }

    //方法3 为spring中的依赖注入 原理与上文类似
    //@Autowired //按类型注入
    //Aqualifier("studentDaoJpaImpl")
    //    public void setStudentDao(StudentDao studentDao){
    //        this.studentDao=studentDao;
    //    }


    @Override
    public int add(String name){
        System.out.println("-----业务层-----");
        System.out.println("用户名是否重名");
        int result=studentDao.add(name);
        System.out.println("-----业务操作结束-----");
        return result;
    }

    @Override
    public void update(String name){
        System.out.println("-----业务层-----");
        System.out.println("用户名是否重名");
        studentDao.update(name);
        System.out.println("-----业务操作结束-----");
    }
    @Override
    public void find(String name){
        System.out.println("-----业务层-----");
        System.out.println("查找学生"+name);
        studentDao.update(name);
        Random r=new Random();
        try {
            Thread.sleep(r.nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----业务操作结束-----");
    }

}
