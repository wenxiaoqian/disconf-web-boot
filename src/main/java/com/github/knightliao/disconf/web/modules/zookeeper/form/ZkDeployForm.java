package com.github.knightliao.disconf.web.modules.zookeeper.form;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author liaoqiqi
 * @version 2014-9-11
 */
@Data
public class ZkDeployForm {

    @NotNull
    private Long appId;

    @NotNull
    private String version;

    @NotNull
    private Long envId;

}
