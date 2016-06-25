package com.github.knightliao.disconf.web.modules.config.service;

/**
 * Created by knightliao on 15/12/25.
 */
public interface ConfigHistoryMgr {

    void createOne(Long configId, String oldValue, String newValue);
}
