package com.github.knightliao.disconf.web.support.exception;

import com.github.knightliao.disconf.web.support.exception.base.ErrorCode;
import com.github.knightliao.disconf.web.support.exception.base.ModuleCode;
import com.github.knightliao.disconf.web.support.exception.base.RuntimeGlobalException;

/**
 * @author liaoqiqi
 * @version 2014-6-24
 */
public class UnExpectedException extends RuntimeGlobalException {

    private static final long serialVersionUID = 1L;

    public UnExpectedException(String exceptionMessage) {
        super(ErrorCode.DAO_ERROR, exceptionMessage);
    }

    @Override
    public ModuleCode getModuleCode() {
        return ModuleCode.EXCEPTION;
    }

    public UnExpectedException(String exceptionMessage, Throwable throwable) {

        super(ErrorCode.UN_EXPECTED, exceptionMessage, throwable);
    }

}
