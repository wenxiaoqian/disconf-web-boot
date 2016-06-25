package com.github.knightliao.disconf.web.modules.env.bo;

import com.github.knightliao.orm.commons.BaseObject;
import com.github.knightliao.orm.jorm.annotation.Column;
import com.github.knightliao.orm.jorm.annotation.Table;
import com.github.knightliao.disconf.web.support.constants.dao.Columns;
import com.github.knightliao.disconf.web.support.constants.dao.DB;

import lombok.Data;

/**
 * @author liaoqiqi
 * @version 2014-6-16
 */
@Data
@Table(db = DB.DB_NAME, name = "env", keyColumn = Columns.ENV_ID)
public class Env extends BaseObject<Long> {

    /**
     *
     */
    private static final long serialVersionUID = -665241738023640732L;

    /**
     *
     */
    @Column(value = Columns.NAME)
    private String name;

}
