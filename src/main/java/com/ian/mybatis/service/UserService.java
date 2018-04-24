package com.ian.mybatis.service;

import com.ian.mybatis.po.User;

import java.util.List;

public interface UserService {

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(Integer id);

    User getUser(Integer id);

    List<User> findUsers(String userName, int start, int limit);

}
