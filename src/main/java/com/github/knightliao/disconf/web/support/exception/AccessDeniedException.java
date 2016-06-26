package com.github.knightliao.disconf.web.support.exception;

import com.github.knightliao.disconf.web.support.exception.base.ErrorCode;
import com.github.knightliao.disconf.web.support.exception.base.ModuleCode;
import com.github.knightliao.disconf.web.support.exception.base.RuntimeGlobalException;

/**
 * @Description: the method is not accessible to current user
 */
public class AccessDeniedException extends RuntimeGlobalException {

    private static final long serialVersionUID = 1L;

    public AccessDeniedException(String exceptionMessage) {
        super(ErrorCode.GLOBAL_ERROR, exceptionMessage);
    }

    @Override
    public ModuleCode getModuleCode() {
        return ModuleCode.OTHER;
    }

}
