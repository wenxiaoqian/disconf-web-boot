package com.github.knightliao.disconf.web.support.exception;

import com.github.knightliao.disconf.web.support.exception.base.ErrorCode;
import com.github.knightliao.disconf.web.support.exception.base.ModuleCode;
import com.github.knightliao.disconf.web.support.exception.base.RuntimeGlobalException;

/**
 * 数据库异常错误
 *
 * @author liaoqiqi
 * @version 2014-6-24
 */
public class DaoException extends RuntimeGlobalException {

    private static final long serialVersionUID = 1L;

    public DaoException(String exceptionMessage) {
        super(ErrorCode.DAO_ERROR, exceptionMessage);
    }

    @Override
    public ModuleCode getModuleCode() {
        return ModuleCode.EXCEPTION;
    }

    public DaoException(String exceptionMessage, Throwable throwable) {

        super(ErrorCode.DAO_ERROR, exceptionMessage, throwable);
    }
}
