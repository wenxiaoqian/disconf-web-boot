package com.github.knightliao.disconf.web.api.app.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.knightliao.disconf.web.modules.app.bo.App;
import com.github.knightliao.disconf.web.modules.app.form.AppNewForm;
import com.github.knightliao.disconf.web.modules.app.service.AppMgr;
import com.github.knightliao.disconf.web.support.exception.FieldException;

/**
 * 权限验证
 *
 * @author liaoqiqi
 * @version 2014-7-2
 */
@Component
public class AppValidator {

    @Autowired
    private AppMgr appMgr;

    /**
     * 验证创建
     */
    public void validateCreate(AppNewForm appNewForm) {

        // trim
        if (appNewForm.getApp() != null) {
            appNewForm.setApp(appNewForm.getApp().trim());
        }
        if (appNewForm.getDesc() != null) {
            appNewForm.setDesc(appNewForm.getDesc().trim());
        }

        App app = appMgr.getByName(appNewForm.getApp());
        if (app != null) {
            throw new FieldException(AppNewForm.APP, "app.exist", null);
        }
    }

}
