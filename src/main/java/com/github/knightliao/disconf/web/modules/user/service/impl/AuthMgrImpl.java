package com.github.knightliao.disconf.web.modules.user.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.knightliao.disconf.web.modules.user.service.UserInnerMgr;
import com.github.knightliao.disconf.web.modules.user.service.AuthMgr;

/**
 * @author knightliao
 */
@Service
public class AuthMgrImpl implements AuthMgr {

    @Autowired
    private UserInnerMgr userInnerMgr;

    @Override
    public boolean verifyApp4CurrentUser(Long appId) {

        Set<Long> idsLongs = userInnerMgr.getVisitorAppIds();

        if (CollectionUtils.isEmpty(idsLongs)) {
            return true;
        }

        if (idsLongs.contains(appId)) {
            return true;
        } else {
            return false;
        }

    }

}
