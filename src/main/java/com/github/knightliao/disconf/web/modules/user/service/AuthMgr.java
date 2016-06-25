package com.github.knightliao.disconf.web.modules.user.service;

/**
 * @author knightliao
 */
public interface AuthMgr {

    boolean verifyApp4CurrentUser(Long appId);
}
