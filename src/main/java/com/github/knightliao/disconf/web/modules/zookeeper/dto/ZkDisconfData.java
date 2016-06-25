package com.github.knightliao.disconf.web.modules.zookeeper.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * 每个配置对应的数据
 *
 * @author liaoqiqi
 * @version 2014-9-12
 */
@Data
public class ZkDisconfData {

    /**
     * 每个配置对应一个实例的数据
     *
     * @author liaoqiqi
     * @version 2014-9-12
     */
    @Data
    public static class ZkDisconfDataItem {

        // 所在机器
        private String machine = "";

        // 值
        private String value = "";

        private List<String> errorList = new ArrayList<String>();
    }

    /*
     * 
     */
    private List<ZkDisconfDataItem> data = new ArrayList<ZkDisconfDataItem>();

    private String key;
}
