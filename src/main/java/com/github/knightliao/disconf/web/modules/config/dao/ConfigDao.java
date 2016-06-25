package com.github.knightliao.disconf.web.modules.config.dao;

import java.util.List;

import com.baidu.disconf.core.common.constants.DisConfigTypeEnum;
import com.github.knightliao.disconf.web.modules.config.bo.Config;
import com.github.knightliao.orm.jorm.dao.BaseDao;
import com.github.knightliao.disconf.web.support.common.dao.DaoPageResult;
import com.github.knightliao.disconf.web.support.common.web.form.RequestListBase;

/**
 * @author liaoqiqi
 * @version 2014-6-16
 */
public interface ConfigDao extends BaseDao<Long, Config> {

    /**
     * @param appId
     * @param envId
     * @param version
     * @param key
     * @param disConfigTypeEnum
     *
     * @return
     */
    Config getByParameter(Long appId, Long envId, String version, String key, DisConfigTypeEnum disConfigTypeEnum);

    /**
     * @param
     *
     * @return
     */
    List<Config> getConfByAppEnv(Long appId, Long envId);

    /**
     * @param appId
     * @param envId
     * @param version
     *
     * @return
     */
    DaoPageResult<Config> getConfigList(Long appId, Long envId, String version, RequestListBase.Page page);

    /**
     * @param configId
     *
     * @return
     */
    void updateValue(Long configId, String value);

    /**
     *
     */
    String getValue(Long configId);

    /**
     * @param appId
     * @param envId
     * @param version
     * @param hasValue
     *
     * @return
     */
    List<Config> getConfigList(Long appId, Long envId, String version, Boolean hasValue);

    /**
     * @param configId
     */
    void deleteItem(Long configId);
}
