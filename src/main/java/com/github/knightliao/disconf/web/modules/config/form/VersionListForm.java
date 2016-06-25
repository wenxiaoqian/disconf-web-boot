package com.github.knightliao.disconf.web.modules.config.form;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author liaoqiqi
 * @version 2014-6-22
 */
@Data
public class VersionListForm {

    @NotNull
    private Long appId;

    // 环境可以为空
    private Long envId;

}
