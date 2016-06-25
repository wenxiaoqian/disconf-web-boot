package com.github.knightliao.disconf.web.modules.app.dao.impl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.knightliao.disconf.web.modules.app.bo.App;
import com.github.knightliao.disconf.web.modules.app.dao.AppDao;
import com.github.knightliao.orm.jorm.operator.Match;
import com.github.knightliao.disconf.web.support.common.dao.AbstractDao;
import com.github.knightliao.disconf.web.support.constants.dao.Columns;

/**
 * @author liaoqiqi
 * @version 2014-6-16
 */
@Service
public class AppDaoImpl extends AbstractDao<Long, App> implements AppDao {

    @Override
    public App getByName(String name) {

        return findOne(new Match(Columns.NAME, name));
    }

    @Override
    public List<App> getByIds(Set<Long> ids) {

        if (CollectionUtils.isEmpty(ids)) {
            return findAll();
        }

        return find(match(Columns.APP_ID, ids));
    }

}
