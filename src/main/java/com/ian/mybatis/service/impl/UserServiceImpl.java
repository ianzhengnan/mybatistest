package com.ian.mybatis.service.impl;

import com.ian.mybatis.dao.UserDao;
import com.ian.mybatis.po.User;
import com.ian.mybatis.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED)
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public int deleteUser(Integer id) {
        return userDao.deleteUser(id);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public User getUser(Integer id) {
        return userDao.getUser(id);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> findUsers(String userName, int start, int limit) {
        return userDao.findUsers(userName, new RowBounds(start, limit));
    }
}
