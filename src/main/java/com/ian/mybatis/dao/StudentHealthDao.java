package com.ian.mybatis.dao;

import com.ian.mybatis.po.StudentHealthFemale;
import com.ian.mybatis.po.StudentHealthMale;

import java.util.List;

public interface StudentHealthDao {

    List<StudentHealthMale> findStudentHealthMaleByStuId(int id);

    List<StudentHealthFemale> findStudentHealthFemaleByStuId(int id);
}
