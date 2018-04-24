package com.ian.mybatis.controller;

import com.ian.mybatis.po.Role;
import com.ian.mybatis.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/role/getRole")
    @ResponseBody
    public Role getRole(@RequestParam("id") Long id){
        long start = System.currentTimeMillis();
        Role role = this.roleService.getRole(id);
        long end = System.currentTimeMillis();
        System.err.println("getRole spend time: " + (end - start));
        return role;
    }
}
