package com.github.knightliao.disconf.web.modules.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.github.knightliao.disconf.web.modules.user.bo.User;
import com.github.knightliao.disconf.web.modules.user.dao.UserDao;
import com.github.knightliao.disconf.web.support.common.dao.AbstractDao;
import com.github.knightliao.disconf.web.support.constants.dao.Columns;

/**
 * @author liaoqiqi
 * @version 2013-11-28
 */
@Repository
public class UserDaoImpl extends AbstractDao<Long, User> implements UserDao {

    /**
     * 执行SQL
     */
    public void executeSql(String sql) {

        executeSQL(sql, null);
    }

    /**
     */
    @Override
    public User getUserByName(String name) {

        return findOne(match(Columns.NAME, name));
    }

}