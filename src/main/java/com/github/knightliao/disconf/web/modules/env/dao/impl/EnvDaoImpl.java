package com.github.knightliao.disconf.web.modules.env.dao.impl;

import org.springframework.stereotype.Service;

import com.github.knightliao.disconf.web.modules.env.bo.Env;
import com.github.knightliao.disconf.web.modules.env.dao.EnvDao;
import com.github.knightliao.disconf.web.support.common.dao.AbstractDao;
import com.github.knightliao.disconf.web.support.constants.dao.Columns;
import com.github.knightliao.orm.jorm.operator.Match;

/**
 * @author liaoqiqi
 * @version 2014-6-16
 */
@Service
public class EnvDaoImpl extends AbstractDao<Long, Env> implements EnvDao {

    @Override
    public Env getByName(String name) {

        return findOne(new Match(Columns.NAME, name));
    }

}
