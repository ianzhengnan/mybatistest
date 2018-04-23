package com.ian.mybatis.mapper;

import com.ian.mybatis.po.Role;

import java.util.List;

public interface RoleMapper {

    Role getRole(Long id);

    int deleteRole(Long id);

    int insertRole(Role role);

    List<Role> getRoles();
}
