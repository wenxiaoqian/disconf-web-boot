package com.github.knightliao.disconf.web.modules.app.dao;

import java.util.List;
import java.util.Set;

import com.github.knightliao.disconf.web.modules.app.bo.App;
import com.github.knightliao.orm.jorm.dao.BaseDao;

/**
 * @author liaoqiqi
 * @version 2014-6-16
 */
public interface AppDao extends BaseDao<Long, App> {

    /**
     * @param name
     *
     * @return
     */
    App getByName(String name);

    /**
     * @param ids
     *
     * @return
     */
    List<App> getByIds(Set<Long> ids);

}
