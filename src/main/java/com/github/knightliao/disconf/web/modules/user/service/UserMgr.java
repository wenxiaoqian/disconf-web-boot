package com.github.knightliao.disconf.web.modules.user.service;

import java.util.List;

import com.github.knightliao.disconf.web.modules.user.bo.User;
import com.github.knightliao.disconf.web.modules.user.dto.Visitor;
import com.github.knightliao.disconf.web.modules.user.vo.VisitorVo;

/**
 * @author liaoqiqi
 * @version 2013-11-28
 */
public interface UserMgr {

    /**
     * 获取用户的基本信息（登录用户）
     *
     * @return
     */
    Visitor getVisitor(Long userId);

    VisitorVo getCurVisitor();

    User getUser(Long userId);

    /**
     * @return
     */
    Long create(User user);

    /**
     * @param user
     */
    void create(List<User> user);

    /**
     * @return
     */
    List<User> getAll();

    /**
     * 为某个user添加一个app
     *
     * @param userId
     */
    String addOneAppForUser(Long userId, int appId);

}
