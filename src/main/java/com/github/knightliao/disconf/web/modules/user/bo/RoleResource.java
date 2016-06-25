package com.github.knightliao.disconf.web.modules.user.bo;

import com.github.knightliao.orm.commons.BaseObject;
import com.github.knightliao.orm.jorm.annotation.Column;
import com.github.knightliao.orm.jorm.annotation.Table;
import com.github.knightliao.disconf.web.support.constants.dao.Columns;
import com.github.knightliao.disconf.web.support.constants.dao.DB;

import lombok.Data;

/**
 *
 */
@Data
@Table(db = DB.DB_NAME, keyColumn = "role_res_id", name = "role_resource")
public class RoleResource extends BaseObject<Integer> {

    private static final long serialVersionUID = 1L;

    @Column(value = Columns.ROLE_ID)
    private Integer roleId;

    @Column(value = "url_pattern")
    private String urlPattern;

    @Column(value = "url_description")
    private String urlDescription;

    @Column(value = "method_mask")
    private String methodMask;

    @Column(value = Columns.UPDATE_TIME)
    private String updateTime;

}
