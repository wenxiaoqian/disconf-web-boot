package com.github.knightliao.disconf.web.modules.app.bo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
@Table(db = DB.DB_NAME, name = "app", keyColumn = Columns.APP_ID)
public class App extends BaseObject<Long> {

    protected static final Logger LOG = LoggerFactory.getLogger(App.class);

    /**
     *
     */
    @Column(value = Columns.NAME)
    private String name;

    /**
     *
     */
    @Column(value = Columns.DESC)
    private String desc;

    /**
     *
     */
    @Column(value = Columns.EMAILS)
    private String emails;

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
