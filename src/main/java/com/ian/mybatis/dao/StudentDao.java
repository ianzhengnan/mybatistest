package com.ian.mybatis.dao;

import com.ian.mybatis.po.Student;

public interface StudentDao {

    Student getStudent(int id);

    int insertStudent(Student student);

}
