package com.ian.mybatis.service.impl;

import com.ian.mybatis.dao.RoleDao;
import com.ian.mybatis.po.Role;
import com.ian.mybatis.service.RoleService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED)
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    public int insertRole(Role role) {
        return roleDao.insertRole(role);
    }

    public int updateRole(Role role) {
        return roleDao.updateRole(role);
    }

    public int deleteRole(Long id) {
        return roleDao.deleteRole(id);
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    public Role getRole(Long id) {
        return roleDao.getRole(id);
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Role> findRoles(String roleName, int start, int limit) {
        return roleDao.findRoles(roleName, new RowBounds(start, limit));
    }
}
