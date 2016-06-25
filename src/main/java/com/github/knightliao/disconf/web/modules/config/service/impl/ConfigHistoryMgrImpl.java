package com.github.knightliao.disconf.web.modules.config.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.knightliao.disconf.web.modules.config.bo.ConfigHistory;
import com.github.knightliao.disconf.web.modules.config.dao.ConfigHistoryDao;
import com.github.knightliao.disconf.web.modules.config.service.ConfigHistoryMgr;
import com.github.knightliao.disconf.web.support.constants.DataFormatConstants;
import com.github.knightliao.disconf.web.support.utils.DateUtils;

/**
 * Created by knightliao on 15/12/25.
 */
@Service
public class ConfigHistoryMgrImpl implements ConfigHistoryMgr {

    @Autowired
    private ConfigHistoryDao configHistoryDao;

    @Override
    public void createOne(Long configId, String oldValue, String newValue) {

        ConfigHistory configHistory = new ConfigHistory();

        configHistory.setConfigId(configId);
        configHistory.setOldValue(oldValue);
        configHistory.setNewValue(newValue);

        String curTime = DateUtils.format(new Date(), DataFormatConstants.COMMON_TIME_FORMAT);
        configHistory.setCreateTime(curTime);

        configHistoryDao.create(configHistory);
    }
}
