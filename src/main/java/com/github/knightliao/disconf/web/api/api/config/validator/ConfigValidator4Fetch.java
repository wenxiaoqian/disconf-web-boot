package com.github.knightliao.disconf.web.api.api.config.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.knightliao.disconf.web.modules.app.bo.App;
import com.github.knightliao.disconf.web.modules.app.service.AppMgr;
import com.github.knightliao.disconf.web.modules.config.form.ConfForm;
import com.github.knightliao.disconf.web.modules.config.form.ConfigFullModel;
import com.github.knightliao.disconf.web.modules.config.service.ConfigMgr;
import com.github.knightliao.disconf.web.modules.env.bo.Env;
import com.github.knightliao.disconf.web.modules.env.service.EnvMgr;
import com.github.knightliao.disconf.web.support.exception.FieldException;

/**
 * @author knightliao
 */
@Service
public class ConfigValidator4Fetch {

    @Autowired
    private AppMgr appMgr;

    @Autowired
    private EnvMgr envMgr;

    @Autowired
    private ConfigMgr configMgr;

    /**
     * 此接口是客户的接口，非常 重要，目前没有权限的控制
     *
     * @param confForm
     */
    public ConfigFullModel verifyConfForm(ConfForm confForm, boolean unCheckKey) {

        //
        // app
        //
        if (StringUtils.isEmpty(confForm.getApp())) {
            throw new FieldException("app", "app is empty", null);
        }

        App app = appMgr.getByName(confForm.getApp());
        if (app == null) {
            throw new FieldException("app", "app " + confForm.getApp() + " doesn't exist in db.", null);
        }

        //
        // env
        //
        if (StringUtils.isEmpty(confForm.getEnv())) {
            throw new FieldException("env", "env is empty", null);
        }

        Env env = envMgr.getByName(confForm.getEnv());
        if (env == null) {
            throw new FieldException("env", "env " + confForm.getEnv() + " doesn't exist in db.", null);
        }

        //
        // key
        //
        if (!unCheckKey && StringUtils.isEmpty(confForm.getKey())) {
            throw new FieldException("key", "key is empty", null);
        }

        //
        // version
        //
        if (StringUtils.isEmpty(confForm.getVersion())) {
            throw new FieldException("version", "version is empty", null);
        }

        return new ConfigFullModel(app, env, confForm.getVersion(), confForm.getKey());
    }
}
