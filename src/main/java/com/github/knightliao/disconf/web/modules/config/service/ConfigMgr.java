package com.github.knightliao.disconf.web.modules.config.service;

import java.io.File;
import java.util.List;

import com.baidu.disconf.core.common.constants.DisConfigTypeEnum;
import com.github.knightliao.disconf.web.modules.config.bo.Config;
import com.github.knightliao.disconf.web.modules.config.form.ConfListForm;
import com.github.knightliao.disconf.web.modules.config.form.ConfNewItemForm;
import com.github.knightliao.disconf.web.modules.config.vo.ConfListVo;
import com.github.knightliao.disconf.web.modules.config.vo.MachineListVo;
import com.github.knightliao.disconf.web.support.common.dao.DaoPageResult;

/**
 * @author liaoqiqi
 * @version 2014-6-16
 */
public interface ConfigMgr {

    /**
     * @param
     *
     * @return
     */
    List<String> getVersionListByAppEnv(Long appId, Long envId);

    /**
     * @return
     */
    DaoPageResult<ConfListVo> getConfigList(ConfListForm confListForm, boolean fetchZk, final boolean getErrorMessage);

    /**
     * @param configId
     *
     * @return
     */
    ConfListVo getConfVo(Long configId);

    MachineListVo getConfVoWithZk(Long configId);

    /**
     * @param configId
     *
     * @return
     */
    Config getConfigById(Long configId);

    /**
     * 更新 配置项/配置文件
     *
     * @param configId
     *
     * @return
     */
    String updateItemValue(Long configId, String value);

    /**
     * @param configId
     *
     * @return
     */
    String getValue(Long configId);

    void notifyZookeeper(Long configId);

    /**
     * @param confNewForm
     * @param disConfigTypeEnum
     */
    void newConfig(ConfNewItemForm confNewForm, DisConfigTypeEnum disConfigTypeEnum);

    void delete(Long configId);

    /**
     * @param confListForm
     *
     * @return
     */
    List<File> getDisconfFileList(ConfListForm confListForm);

}
