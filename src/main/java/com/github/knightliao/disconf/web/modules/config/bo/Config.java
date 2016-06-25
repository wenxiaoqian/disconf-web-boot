package com.github.knightliao.disconf.web.modules.config.bo;

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
@Table(db = DB.DB_NAME, name = "config", keyColumn = Columns.CONFIG_ID)
public class Config extends BaseObject<Long> {

    /**
     *
     */
    private static final long serialVersionUID = -2217832889126331664L;

    /**
     *
     */
    @Column(value = Columns.TYPE)
    private Integer type;

    /**
     * status
     */
    @Column(value = Columns.STATUS)
    private Integer status;

    /**
     *
     */
    @Column(value = Columns.NAME)
    private String name;

    /**
     *
     */
    @Column(value = Columns.VALUE)
    private String value;

    /**
     *
     */
    @Column(value = Columns.APP_ID)
    private Long appId;

    /**
     *
     */
    @Column(value = Columns.VERSION)
    private String version;

    /**
     *
     */
    @Column(value = Columns.ENV_ID)
    private Long envId;

    /**
     * 创建时间
     */
    @Column(value = Columns.CREATE_TIME)
    private String createTime;

    /**
     * 更新时间
     */
    @Column(value = Columns.UPDATE_TIME)
    private String updateTime;

}
