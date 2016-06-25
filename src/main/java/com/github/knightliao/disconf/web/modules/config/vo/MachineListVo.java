package com.github.knightliao.disconf.web.modules.config.vo;

import java.util.List;

import com.github.knightliao.disconf.web.modules.zookeeper.dto.ZkDisconfData;

import lombok.Data;

/**
 * @author knightliao
 */
@Data
public class MachineListVo {

    private List<ZkDisconfData.ZkDisconfDataItem> datalist;
    private int errorNum = 0;
    private int machineSize;

}
