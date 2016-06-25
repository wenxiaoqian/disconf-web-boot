package com.github.knightliao.disconf.web.modules.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.github.knightliao.disconf.web.modules.user.bo.User;
import com.github.knightliao.disconf.web.modules.user.dao.SignDao;
import com.github.knightliao.disconf.web.support.common.dao.AbstractDao;

/**
 * @author liaoqiqi
 * @version 2013-11-28
 */
@Repository
public class SignDaoImpl extends AbstractDao<Long, User> implements SignDao {

}