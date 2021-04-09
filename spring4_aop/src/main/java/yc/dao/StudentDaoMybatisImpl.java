package yc.dao;

import java.util.Random;

/**
 * @program: testSpring
 * @description:
 * @author: Erebus
 * @create: 2021-04-04 14:45
 */
public class StudentDaoMybatisImpl  implements  StudentDao {
    @Override
    public int add(String name) {
        System.out.println("mybatis 添加学生 "+name);
        Random r=new Random();

        return r.nextInt();
    }

    @Override
    public void update(String name) {

        System.out.println("mybatis 修改学生");
    }

    @Override
    public String find(String name) {
        System.out.println("Mybatis 查询学生 "+name);

        return name;
    }
}
