package com.github.knightliao.disconf.web.modules.config.form;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

/**
 * 新建配置文件表格
 *
 * @author liaoqiqi
 * @version 2014-7-3
 */
@Data
public class ConfNewForm {

    @NotNull(message = "app.empty")
    private Long appId;
    public static final String APPID = "appId";

    @NotNull(message = "version.empty")
    @NotEmpty(message = "version.empty")
    private String version;
    public static final String VERSION = "version";

    @NotNull(message = "env.empty")
    private Long envId;
    public static final String ENVID = "envId";

    public ConfNewForm(Long appId, String version, Long envId) {
        super();
        this.appId = appId;
        this.version = version;
        this.envId = envId;
    }

    public ConfNewForm() {
        super();
    }

}
