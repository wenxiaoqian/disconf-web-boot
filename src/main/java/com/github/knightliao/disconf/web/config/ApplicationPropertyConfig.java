package com.github.knightliao.disconf.web.config;

import org.springframework.stereotype.Service;

import lombok.Data;

/**
 * @author knightliao
 */
@Data
@Service
public class ApplicationPropertyConfig {

    //
    // email setting
    //

    private String emailHost;

    private String emailPassword;

    private String emailUser;

    private String emailPort;

    private String fromEmail;

    private String emailReceiver;

    private boolean emailMonitorOn = false;

    //
    // consistency
    //

    private boolean checkConsistencyOn = false;

    //
    // domain
    //
    private String domain;

}
