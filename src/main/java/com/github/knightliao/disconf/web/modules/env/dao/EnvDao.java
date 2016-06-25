package com.github.knightliao.disconf.web.modules.env.dao;

import com.github.knightliao.disconf.web.modules.env.bo.Env;
import com.github.knightliao.orm.jorm.dao.BaseDao;

/**
 * @author liaoqiqi
 * @version 2014-6-16
 */
public interface EnvDao extends BaseDao<Long, Env> {

    /**
     * @param name
     *
     * @return
     */
    Env getByName(String name);
}
