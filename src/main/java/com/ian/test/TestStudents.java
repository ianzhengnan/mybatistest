package com.ian.test;

import com.ian.mybatis.dao.StudentDao;
import com.ian.mybatis.po.Sex;
import com.ian.mybatis.po.Student;
import org.apache.ibatis.session.SqlSession;

public class TestStudents {

    public static void main(String[] args) {
        enumOrdinalTypeHandler();
    }

    public static void enumOrdinalTypeHandler(){
        SqlSession sqlSession = null;

        try{
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
            Student student = new Student();
            student.setName("战三");
            student.setSelfCardno(1234567);
            student.setSex(Sex.MALE);
            student.setNote("Test EnumOrdinalTypeHandler");
            studentDao.insertStudent(student);
            Student student1 = studentDao.getStudent(3);
            System.out.println(student1.getSex());
            sqlSession.commit();
        }catch (Exception ex){
            System.err.println(ex.getMessage());
            sqlSession.rollback();
        }finally {
            if(sqlSession != null)
                sqlSession.close();
        }


    }
}
