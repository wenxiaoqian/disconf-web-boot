package com.github.knightliao.disconf.web.modules.user.dao;

import com.github.knightliao.disconf.web.modules.user.bo.User;
import com.github.knightliao.orm.jorm.dao.BaseDao;

/**
 * @author liaoqiqi
 * @version 2013-11-28
 */
public interface UserDao extends BaseDao<Long, User> {

    void executeSql(String sql);

    User getUserByName(String name);

}
