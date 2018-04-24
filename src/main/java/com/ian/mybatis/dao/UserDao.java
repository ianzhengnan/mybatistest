package com.ian.mybatis.dao;

import com.ian.mybatis.po.User;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    User getUser(Integer id);

    int insertUser(User user);

    int deleteUser(Integer id);

    int updateUser(User user);

    List<User> findUsers(String userName, RowBounds rowBounds);

}
