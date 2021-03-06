package com.ian.test;

import com.ian.mapper.RoleMapper;
import com.ian.mybatis.po.Role;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMybatis {

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        Map<String, Role> rolesMap = new HashMap<String, Role>();

        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("testName");
            role.setNote("testNote");
//            roleMapper.insertRole(role);
            List<Role> roles = roleMapper.getRoles();
            System.out.println(roles);
//            roleMapper.deleteRole(1L);
            sqlSession.commit();   // default the autocommit is set to false
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            sqlSession.rollback();
        } finally {
            if (sqlSession != null)
                sqlSession.close();
        }
    }
}
