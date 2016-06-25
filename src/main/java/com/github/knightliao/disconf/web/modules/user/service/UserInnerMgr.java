package com.github.knightliao.disconf.web.modules.user.service;

import java.util.Set;

import com.github.knightliao.disconf.web.modules.user.dto.Visitor;

public interface UserInnerMgr {

    /**
     * 获取用户的基本信息（登录用户）
     *
     * @return
     */
    Visitor getVisitor(Long userId);

    /**
     * @return
     */
    Set<Long> getVisitorAppIds();
}
