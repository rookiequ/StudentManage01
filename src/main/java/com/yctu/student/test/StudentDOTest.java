package com.yctu.student.test;

import com.yctu.student.dao.StudentDAO;
import com.yctu.student.domain.StudentDO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName StudentDOTest
 * @Description 对StudentDO实体类的增删改查进行测试
 * @Author qlq
 * @Date 2020-06-14 00:03
 */
public class StudentDOTest {

    private ApplicationContext applicationContext;
    private StudentDAO studentDAO;


    @Before
    public void init(){
        applicationContext = (ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");
        studentDAO = (StudentDAO) applicationContext.getBean("studentDAO");
    }



    @Test
    public void testGetAllStudent(){
        List<StudentDO> studentDOList = studentDAO.getAllStudent();
        for (StudentDO studentDO : studentDOList) {
            System.out.println(studentDO);
        }
    }

    @Test
    public void testGetStudentById(){
        StudentDO studentDO = studentDAO.getStudentById(1L);
        System.out.println(studentDO);
    }


    @Test
    public void testAddStudent(){
        StudentDO studentDO = new StudentDO();
        studentDO.setNumber(17233623);
        studentDO.setPassword("123456");
        studentDO.setName("渠立庆");
        studentDO.setPhone("13212345678");
        studentDO.setClassroom("176");
        studentDO.setCollege("信工元");
        studentDO.setSex("男 ");
        studentDO.setMajor("软件工程");
        studentDO.setBirthday(LocalDateTime.now());
        studentDO.setEntryTime(LocalDateTime.now());
        studentDAO.addStudent(studentDO);
    }


    @Test
    public void testUpdateStudent(){
        StudentDO studentDO = new StudentDO();
        studentDO.setId(1L);
        studentDO.setNumber(17263630);
        studentDO.setPassword("123456");
        studentDO.setName("周子钦");
        studentDO.setPhone("1321234567");
        studentDO.setClassroom("176班");
        studentDO.setCollege("信息工程学院");
        studentDO.setSex("男 ");
        studentDO.setMajor("软件工程");
        studentDO.setBirthday(LocalDateTime.now());
        studentDO.setEntryTime(LocalDateTime.now());
        studentDAO.updateStudent(studentDO);
    }

    @Test
    public void testDeleteStudent(){
        studentDAO.deleteStudentById(2L);
    }

}
