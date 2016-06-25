package com.github.knightliao.disconf.web.modules.user.service;

import java.util.List;

import com.github.knightliao.disconf.web.modules.user.bo.Role;

/**
 * @author weiwei
 * @date 2013-12-24
 */
public interface RoleMgr {

    public Role get(Integer roleId);

    public List<Role> findAll();

}
