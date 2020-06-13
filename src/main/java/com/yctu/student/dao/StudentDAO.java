package com.yctu.student.dao;

import com.yctu.student.domain.StudentDO;

import java.time.LocalDateTime;
import java.util.List;

public interface StudentDAO {

    /**
     * 获取所有学生信息
     * @return
     */
    List<StudentDO> getAllStudent();

    /**
     * 根据id获取学生信息
     * @param id
     * @return
     */
    StudentDO getStudentById(Long id);

    /**
     * 根据学号获取学生信息
     * @param number
     * @return
     */
    StudentDO getStudentByNumber(int number);

    /**
     * 根据学院获取学生信息
     * @param college
     * @return
     */
    List<StudentDO> getStudentsByCollege(String college);

    /**
     * 根据入学时间学生学生信息
     * @param entryTime
     * @return
     */
    List<StudentDO> getStudentsByEntryTime(LocalDateTime entryTime);

    /**
     * 根据性别获取学生信息
     * @param sex
     * @return
     */
    List<StudentDO> getStudentsBySex(String sex);

    /**
     * 根据姓名获取学生信息
     * @param name
     * @return
     */
    List<StudentDO> getStudentsByName(String name);

    /**
     * 根据条件搜索学生信息
     * @param studentDO
     * @return
     */
    List<StudentDO> searchStudents(StudentDO studentDO);

    /**
     * 新增学生信息
     * @param studentDO
     */
    void addStudent(StudentDO studentDO);

    /**
     * 更新学生信息
     * @param studentDO
     */
    void updateStudent(StudentDO studentDO);

    /**
     * 根据id删除学生信息
     * @param id
     */
    void deleteStudentById(Long id);

}

