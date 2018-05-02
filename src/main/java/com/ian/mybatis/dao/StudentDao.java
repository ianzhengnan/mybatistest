package com.ian.mybatis.dao;

import com.ian.mybatis.po.FemaleStudent;
import com.ian.mybatis.po.MaleStudent;
import com.ian.mybatis.po.Student;

public interface StudentDao {

    Student getStudent(int id);

    MaleStudent getMaleStudent(int id);

    FemaleStudent getFemaleStudent(int id);

    int insertStudent(Student student);

}
