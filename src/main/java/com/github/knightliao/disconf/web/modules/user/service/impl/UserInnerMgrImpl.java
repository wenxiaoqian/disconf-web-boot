package com.github.knightliao.disconf.web.modules.user.service.impl;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.knightliao.disconf.web.modules.user.dao.UserDao;
import com.github.knightliao.disconf.web.modules.user.service.UserInnerMgr;
import com.github.knightliao.disconf.web.modules.user.dto.Visitor;
import com.github.knightliao.disconf.web.support.common.context.WebThreadContext;

/**
 * @author knightliao
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserInnerMgrImpl implements UserInnerMgr {

    protected static final Logger LOG = LoggerFactory.getLogger(UserInnerMgrImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public Visitor getVisitor(Long userId) {

        if (userId == null || userId <= 0) {
            LOG.error("userId is null or <= 0, return null");
            return null;
        }

        return null;
    }

    /**
     *
     */
    @Override
    public Set<Long> getVisitorAppIds() {

        Visitor visitor = WebThreadContext.getSessionVisitor();
        return visitor.getAppIds();
    }
}
