package com.github.knightliao.disconf.web.modules.config.dao.impl;

import org.springframework.stereotype.Service;

import com.github.knightliao.disconf.web.modules.config.bo.ConfigHistory;
import com.github.knightliao.disconf.web.modules.config.dao.ConfigHistoryDao;
import com.github.knightliao.disconf.web.support.common.dao.AbstractDao;

/**
 * Created by knightliao on 15/12/25.
 */
@Service
public class ConfigHistoryDaoImpl extends AbstractDao<Long, ConfigHistory> implements ConfigHistoryDao {
}
