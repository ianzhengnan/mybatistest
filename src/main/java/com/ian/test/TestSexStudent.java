package com.ian.test;

import com.ian.mybatis.dao.StudentDao;
import com.ian.mybatis.po.FemaleStudent;
import com.ian.mybatis.po.MaleStudent;
import com.ian.mybatis.po.Student;
import org.apache.ibatis.session.SqlSession;

public class TestSexStudent {

    public static void main(String[] args) {

        SqlSession sqlSession = null;

        try{
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
//
            MaleStudent maleStu = studentDao.getMaleStudent(1);
//            System.out.println(maleStu);
            FemaleStudent femaleStu = studentDao.getFemaleStudent(2);
//            System.out.println(femaleStu);
//            maleStu.getStudentHealthMales();
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
