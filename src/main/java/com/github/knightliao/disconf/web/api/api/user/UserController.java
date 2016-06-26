package com.github.knightliao.disconf.web.api.api.user;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.knightliao.disconf.web.modules.user.service.RedisLogin;
import com.github.knightliao.disconf.web.api.api.user.validator.AuthValidator;
import com.github.knightliao.disconf.web.modules.user.bo.User;
import com.github.knightliao.disconf.web.modules.user.form.SigninForm;
import com.github.knightliao.disconf.web.modules.user.service.SignMgr;
import com.github.knightliao.disconf.web.modules.user.service.UserMgr;
import com.github.knightliao.disconf.web.modules.user.vo.VisitorVo;
import com.github.knightliao.disconf.web.support.common.annotation.NoAuth;
import com.github.knightliao.disconf.web.support.common.web.BaseController;
import com.github.knightliao.disconf.web.support.common.web.vo.JsonObjectBase;
import com.github.knightliao.disconf.web.support.constants.LoginConstant;
import com.github.knightliao.disconf.web.support.constants.WebConstants;
import com.github.knightliao.disconf.web.support.exception.base.ErrorCode;

/**
 * @author liaoqiqi
 * @version 2014-1-20
 */
@Controller
@RequestMapping(WebConstants.API_PREFIX + "/account")
public class UserController extends BaseController {

    protected static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserMgr userMgr;

    @Autowired
    private AuthValidator authValidator;

    @Autowired
    private SignMgr signMgr;

    @Autowired
    private RedisLogin redisLogin;

    /**
     * GET 获取
     *
     * @param
     *
     * @return
     */
    @NoAuth
    @RequestMapping(value = "/session", method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectBase get() {

        VisitorVo visitorVo = userMgr.getCurVisitor();
        if (visitorVo != null) {

            return buildSuccess("visitor", visitorVo);

        } else {

            // 没有登录啊
            return buildGlobalError("syserror.inner", ErrorCode.GLOBAL_ERROR);
        }
    }

    /**
     * 登录
     *
     * @param signin
     * @param request
     *
     * @return
     */
    @NoAuth
    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    @ResponseBody
    public JsonObjectBase signin(@Valid SigninForm signin, HttpServletRequest request) {

        LOG.info(signin.toString());

        // 验证
        authValidator.validateLogin(signin);

        // 数据库登录
        User user = signMgr.signin(signin.getName());

        // 过期时间
        int expireTime = LoginConstant.SESSION_EXPIRE_TIME;
        if (signin.getRemember().equals(1)) {
            expireTime = LoginConstant.SESSION_EXPIRE_TIME2;
        }

        // redis login
        redisLogin.login(request, user, expireTime);

        VisitorVo visitorVo = userMgr.getCurVisitor();

        return buildSuccess("visitor", visitorVo);
    }

    /**
     * 登出
     *
     * @param request
     *
     * @return
     */
    @NoAuth
    @RequestMapping(value = "/signout", method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectBase signout(HttpServletRequest request) {

        redisLogin.logout(request);

        return buildSuccess("ok", "ok");
    }
}
