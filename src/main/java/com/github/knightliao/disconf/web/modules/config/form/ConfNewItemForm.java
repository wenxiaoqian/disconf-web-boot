package com.github.knightliao.disconf.web.modules.config.form;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

/**
 * 新建配置项表格
 *
 * @author liaoqiqi
 * @version 2014-7-3
 */
@Data
public class ConfNewItemForm extends ConfNewForm {

    @NotNull(message = "value.empty")
    @NotEmpty(message = "value.empty")
    private String value;
    public static final String VALUE = "value";

    @NotNull(message = "key.empty")
    @NotEmpty(message = "key.empty")
    private String key;
    public static final String KEY = "key";

    public ConfNewItemForm(ConfNewForm confNewForm) {
        super(confNewForm.getAppId(), confNewForm.getVersion(), confNewForm.getEnvId());
    }

    public ConfNewItemForm() {
        super();
    }
}
