package com.github.knightliao.disconf.web.modules.zookeeper.config;

import lombok.Data;

/**
 * @author liaoqiqi
 * @version 2014-6-24
 */
@Data
public class ZooConfig {

    private String zooHosts = "";

    public String zookeeperUrlPrefix = "";

}
