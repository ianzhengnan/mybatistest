package com.ian.mybatis.mapper;

import com.ian.mybatis.po.Role;

public interface RoleMapper {

    Role getRole(Long id);

    int deleteRole(Long id);

    int insertRole(Role role);
}
