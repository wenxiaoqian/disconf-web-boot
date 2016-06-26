package com.github.knightliao.disconf.web.modules.user.service;

import java.util.List;

import com.github.knightliao.disconf.web.modules.user.bo.Role;

/**
 * @date 2013-12-24
 */
public interface RoleMgr {

    Role get(Integer roleId);

    List<Role> findAll();

}
