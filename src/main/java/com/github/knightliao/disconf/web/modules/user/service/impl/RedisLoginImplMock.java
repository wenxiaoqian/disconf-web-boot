package com.github.knightliao.disconf.web.modules.user.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.knightliao.disconf.web.modules.user.bo.User;
import com.github.knightliao.disconf.web.modules.user.dto.Visitor;
import com.github.knightliao.disconf.web.modules.user.service.RedisLogin;
import com.github.knightliao.disconf.web.modules.user.service.UserMgr;
import com.github.knightliao.disconf.web.support.common.context.WebThreadContext;
import com.github.knightliao.disconf.web.support.constants.UserConstant;

/**
 * @author liaoqiqi
 * @version 2014-2-4
 */
public class RedisLoginImplMock implements RedisLogin {

    @Autowired
    private UserMgr userMgr;

    /**
     * 校验Redis是否登录
     */
    @Override
    public Visitor isLogin(HttpServletRequest request) {

        Long userId = 1L;

        User user = userMgr.getUser(userId);

        Visitor visitor = new Visitor();
        visitor.setId(userId);
        visitor.setLoginUserId(userId);
        visitor.setLoginUserName(user.getName());

        return visitor;
    }

    @Override
    public void login(HttpServletRequest request, User user, int expireTime) {

        Visitor visitor = new Visitor();

        visitor.setId(user.getId());
        visitor.setLoginUserId(user.getId());
        visitor.setLoginUserName(user.getName());

        //
        // 更新session
        //
        updateSessionVisitor(request.getSession(), visitor);
    }

    @Override
    public void updateSessionVisitor(HttpSession session, Visitor visitor) {

        if (visitor != null) {
            // 更新
            session.setAttribute(UserConstant.USER_KEY, visitor);
        } else {

            // 删除
            session.removeAttribute(UserConstant.USER_KEY);
        }

        WebThreadContext.putSessionVisitor(visitor);
    }

    @Override
    public void logout(HttpServletRequest request) {

        // 更新session
        updateSessionVisitor(request.getSession(), null);
    }
}
