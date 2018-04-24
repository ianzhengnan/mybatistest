package com.ian.mybatis.service;

import com.ian.mybatis.po.Role;

import java.util.List;

public interface RoleService {

    int insertRole(Role role);

    int updateRole(Role role);

    int deleteRole(Long id);

    Role getRole(Long id);

    List<Role> findRoles(String roleName, int start, int limit);

}
