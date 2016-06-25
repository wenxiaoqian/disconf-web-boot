package com.github.knightliao.disconf.web.modules.user.bo;

import com.github.knightliao.orm.commons.BaseObject;
import com.github.knightliao.orm.jorm.annotation.Column;
import com.github.knightliao.orm.jorm.annotation.Table;
import com.github.knightliao.disconf.web.support.constants.dao.Columns;
import com.github.knightliao.disconf.web.support.constants.dao.DB;

import lombok.Data;

/**
 * 用户表
 *
 * @author liaoqiqi
 * @version 2013-11-28
 */
@Data
@Table(db = DB.DB_NAME, name = "user", keyColumn = Columns.USER_ID)
public class User extends BaseObject<Long> {

    private static final long serialVersionUID = 1L;

    // 唯一
    @Column(value = Columns.NAME)
    private String name;

    // token
    @Column(value = Columns.TOKEN)
    private String token;

    // 密码
    @Column(value = Columns.PASSWORD)
    private String password;

    //
    @Column(value = Columns.OWNAPPS)
    private String ownApps;

    /**
     * 角色ID
     */
    @Column(value = Columns.ROLE_ID)
    private int roleId;

}
