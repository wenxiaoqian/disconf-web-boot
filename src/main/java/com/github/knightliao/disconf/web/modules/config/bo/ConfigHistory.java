package com.github.knightliao.disconf.web.modules.config.bo;

import com.github.knightliao.orm.commons.BaseObject;
import com.github.knightliao.orm.jorm.annotation.Column;
import com.github.knightliao.orm.jorm.annotation.Table;
import com.github.knightliao.disconf.web.support.constants.dao.Columns;
import com.github.knightliao.disconf.web.support.constants.dao.DB;

import lombok.Data;

@Data
@Table(db = DB.DB_NAME, name = "config_history", keyColumn = "id")
public class ConfigHistory extends BaseObject<Long> {

    /**
     *
     */
    @Column(value = Columns.CONFIG_ID)
    private Long configId;

    /**
     *
     */
    @Column(value = "old_value")
    private String oldValue;

    /**
     *
     */
    @Column(value = "new_value")
    private String newValue;

    /**
     * 创建时间
     */
    @Column(value = Columns.CREATE_TIME)
    private String createTime;

}
