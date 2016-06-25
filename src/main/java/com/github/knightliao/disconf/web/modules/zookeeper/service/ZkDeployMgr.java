package com.github.knightliao.disconf.web.modules.zookeeper.service;

import java.util.Map;

import com.baidu.disconf.core.common.constants.DisConfigTypeEnum;
import com.github.knightliao.disconf.web.modules.zookeeper.dto.ZkDisconfData;

/**
 * @author liaoqiqi
 * @version 2014-9-11
 */
public interface ZkDeployMgr {

    /**
     * @param
     * @param
     * @param version
     *
     * @return
     */
    String getDeployInfo(String app, String env, String version);

    /**
     * @param app
     * @param env
     * @param version
     *
     * @return
     */
    Map<String, ZkDisconfData> getZkDisconfDataMap(String app, String env, String version);

    /**
     * 获取指定的数据
     *
     * @param app
     * @param env
     * @param version
     *
     * @return
     */
    ZkDisconfData getZkDisconfData(String app, String env, String version, DisConfigTypeEnum disConfigTypeEnum,
                                   String keyName);
}
