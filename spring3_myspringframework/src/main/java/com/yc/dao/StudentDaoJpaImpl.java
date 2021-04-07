package com.yc.dao;

import com.yc.springframework.stereotype.MyRepository;

import java.util.Random;

/**
 * @program: testSpring
 * @description:
 * @author: Erebus
 * @create: 2021-04-04 14:44
 */
@MyRepository
public class StudentDaoJpaImpl implements  StudentDao {

    @Override
    public int add(String name) {
        System.out.println("jpa 添加学生 "+name);
        Random r=new Random();

        return r.nextInt();
    }

    @Override
    public void update(String name) {

        System.out.println("jpa 修改学生");
    }
}
