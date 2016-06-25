package com.github.knightliao.disconf.web.support.common.web.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.github.knightliao.disconf.web.support.common.context.WebThreadContext;

import lombok.Data;

/**
 * JSON 基类
 *
 * @author liaoqiqi
 * @version 2013-12-3
 */
@Data
public class JsonObjectBase implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8441731449894560959L;

    /**
     * 如果成功的话，数据结果
     */
    protected Map<String, Object> message = new HashMap<String, Object>();

    public JsonObjectBase() {
        sessionId = WebThreadContext.getSessionId();
    }

    /**
     * 会话ID
     */
    private String sessionId = "";

    protected String success = "true";

}
