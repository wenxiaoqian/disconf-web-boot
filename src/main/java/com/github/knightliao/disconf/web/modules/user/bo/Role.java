package com.github.knightliao.disconf.web.modules.user.bo;

import com.github.knightliao.disconf.web.support.constants.dao.Columns;
import com.github.knightliao.disconf.web.support.constants.dao.DB;
import com.github.knightliao.orm.commons.BaseObject;
import com.github.knightliao.orm.jorm.annotation.Column;
import com.github.knightliao.orm.jorm.annotation.Table;

import lombok.Data;

/**
 * @date 2013-12-24 下午2:43:37
 */
@Data
@Table(db = DB.DB_NAME, keyColumn = Columns.ROLE_ID, name = "role")
public class Role extends BaseObject<Integer> {

    private static final long serialVersionUID = 1L;

    @Column(value = Columns.RoleColumns.ROLE_NAME)
    private String roleName;

    @Column(value = Columns.CREATE_TIME)
    private String createTime;

    @Column(value = Columns.CREATE_BY)
    private String createBy;

    @Column(value = Columns.UPDATE_TIME)
    private String updateTime;

    @Column(value = Columns.UPDATE_BY)
    private String updateBy;

}
