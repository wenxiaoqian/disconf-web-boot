package com.github.knightliao.disconf.web.modules.user.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.knightliao.disconf.web.modules.user.service.UserInnerMgr;
import com.github.knightliao.disconf.web.modules.user.bo.User;
import com.github.knightliao.disconf.web.modules.user.dao.UserDao;
import com.github.knightliao.disconf.web.modules.user.dto.Visitor;
import com.github.knightliao.disconf.web.modules.user.service.UserMgr;
import com.github.knightliao.disconf.web.modules.user.vo.VisitorVo;
import com.github.knightliao.disconf.web.support.common.context.WebThreadContext;

/**
 * @author liaoqiqi
 * @version 2013-12-5
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserMgrImpl implements UserMgr {

    protected static final Logger LOG = LoggerFactory.getLogger(UserMgrImpl.class);

    @Autowired
    private UserInnerMgr userInnerMgr;

    @Autowired
    private UserDao userDao;

    @Override
    public Visitor getVisitor(Long userId) {

        return userInnerMgr.getVisitor(userId);
    }

    @Override
    public VisitorVo getCurVisitor() {

        Visitor visitor = WebThreadContext.getSessionVisitor();
        if (visitor == null) {
            return null;
        }

        VisitorVo visitorVo = new VisitorVo();
        visitorVo.setId(visitor.getId());
        visitorVo.setName(visitor.getLoginUserName());

        return visitorVo;
    }

    /**
     * 创建
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Long create(User user) {

        user = userDao.create(user);
        return user.getId();
    }

    /**
     *
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void create(List<User> users) {

        userDao.create(users);
    }

    @Override
    public List<User> getAll() {

        return userDao.findAll();
    }

    /**
     * @param userId
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public String addOneAppForUser(Long userId, int appId) {

        User user = getUser(userId);
        String ownAppIds = user.getOwnApps();
        if (ownAppIds.contains(",")) {
            ownAppIds = ownAppIds + "," + appId;

        } else {
            ownAppIds = String.valueOf(appId);
        }
        user.setOwnApps(ownAppIds);
        userDao.update(user);

        return ownAppIds;
    }

    @Override
    public User getUser(Long userId) {

        return userDao.get(userId);
    }

}
