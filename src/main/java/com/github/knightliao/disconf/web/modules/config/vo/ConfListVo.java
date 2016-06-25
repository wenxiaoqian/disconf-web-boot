package com.github.knightliao.disconf.web.modules.config.vo;

import java.util.List;

import com.github.knightliao.disconf.web.modules.zookeeper.dto.ZkDisconfData;

import lombok.Data;

/**
 * @author liaoqiqi
 * @version 2014-6-23
 */
@Data
public class ConfListVo {

    private Long configId;

    private String appName;
    private Long appId;
    private String version;
    private Long envId;
    private String envName;

    private String type;
    private Integer typeId;

    private String key;

    private String value;

    private String createTime;

    private String modifyTime;

    //
    // zk data
    //
    private int machineSize;
    private List<ZkDisconfData.ZkDisconfDataItem> machineList;
    private int errorNum = 0;

}
