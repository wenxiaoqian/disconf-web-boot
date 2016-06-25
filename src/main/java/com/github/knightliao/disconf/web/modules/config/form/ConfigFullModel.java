package com.github.knightliao.disconf.web.modules.config.form;

import com.github.knightliao.disconf.web.modules.app.bo.App;
import com.github.knightliao.disconf.web.modules.env.bo.Env;

import lombok.Data;

/**
 * @author liaoqiqi
 * @version 2014-9-11
 */
@Data
public class ConfigFullModel {

    private App app;
    private Env env;
    private String version;
    private String key;

    public ConfigFullModel(App app, Env env, String version, String key) {
        super();
        this.app = app;
        this.env = env;
        this.version = version;
        this.key = key;
    }
}
