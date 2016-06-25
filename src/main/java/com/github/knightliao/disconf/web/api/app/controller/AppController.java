package com.github.knightliao.disconf.web.api.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.knightliao.disconf.web.api.app.validator.AppValidator;
import com.github.knightliao.disconf.web.modules.app.form.AppNewForm;
import com.github.knightliao.disconf.web.modules.app.service.AppMgr;
import com.github.knightliao.disconf.web.modules.app.vo.AppListVo;
import com.github.knightliao.disconf.web.support.common.web.BaseController;
import com.github.knightliao.disconf.web.support.common.web.vo.JsonObjectBase;
import com.github.knightliao.disconf.web.support.constants.WebConstants;

/**
 * @author liaoqiqi
 * @version 2014-6-16
 */
@Controller
@RequestMapping(WebConstants.API_PREFIX + "/app")
public class AppController extends BaseController {

    protected static final Logger LOG = LoggerFactory.getLogger(AppController.class);

    @Autowired
    private AppMgr appMgr;

    @Autowired
    private AppValidator appValidator;

    /**
     * list
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectBase list() {

        List<AppListVo> appListVos = appMgr.getAuthAppVoList();

        return buildListSuccess(appListVos, appListVos.size());
    }

    /**
     * create
     *
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public JsonObjectBase create(@Valid AppNewForm appNewForm) {

        LOG.info(appNewForm.toString());

        appValidator.validateCreate(appNewForm);

        appMgr.create(appNewForm);

        return buildSuccess("创建成功");
    }

}
