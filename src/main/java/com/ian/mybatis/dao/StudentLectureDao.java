package com.ian.mybatis.dao;

import com.ian.mybatis.po.StudentLecture;

import java.util.List;

public interface StudentLectureDao {

    List<StudentLecture> findStudentLectureByStuId(int id);

}
