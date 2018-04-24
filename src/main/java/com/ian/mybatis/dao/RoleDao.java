package com.ian.mybatis.dao;

import com.ian.mybatis.po.Role;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleDao {

    int insertRole(Role role);

    int updateRole(Role role);

    int deleteRole(Long id);

    Role getRole(Long id);

    List<Role> findRoles(String roleName, RowBounds rowBounds); // RowBounds好像是分页用的

}
