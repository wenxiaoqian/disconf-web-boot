package com.github.knightliao.disconf.web.modules.config.form;

import com.github.knightliao.disconf.web.support.common.web.form.RequestFormBase;

import lombok.Data;

/**
 * @author liaoqiqi
 * @version 2014-1-24
 */
@Data
public class ConfForm extends RequestFormBase {

    /**
     *
     */
    private static final long serialVersionUID = 4556205917730218419L;

    private String app;

    private String maintype;

    private String version;

    private String env;

    private String key;

}
