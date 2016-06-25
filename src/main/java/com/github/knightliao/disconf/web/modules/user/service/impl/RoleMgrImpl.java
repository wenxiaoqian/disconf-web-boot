package com.github.knightliao.disconf.web.modules.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.knightliao.disconf.web.modules.user.bo.Role;
import com.github.knightliao.disconf.web.modules.user.dao.RoleDao;
import com.github.knightliao.disconf.web.modules.user.service.RoleMgr;

/**
 *
 */
@Service
public class RoleMgrImpl implements RoleMgr {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role get(Integer roleId) {
        return roleDao.get(roleId);
    }

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }

}
