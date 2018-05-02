package com.ian.mybatis.dao;

import com.ian.mybatis.po.StudentSelfcard;

import java.util.List;

public interface StudentSelfCardDao {

    List<StudentSelfCardDao> findStudentSelfcardByStudentId(int id);

    StudentSelfcard getStudentSelfcardById(int id);
}
