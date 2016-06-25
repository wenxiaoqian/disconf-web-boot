package com.github.knightliao.disconf.web.support.exception;

import com.github.knightliao.disconf.web.support.exception.base.ErrorCode;
import com.github.knightliao.disconf.web.support.exception.base.ModuleCode;
import com.github.knightliao.disconf.web.support.exception.base.RuntimeGlobalException;

/**
 * 文件上传错误
 *
 * @author liaoqiqi
 * @version 2014-2-20
 */
public class FileUploadException extends RuntimeGlobalException {

    private static final long serialVersionUID = 1L;

    public FileUploadException(String exceptionMessage) {
        super(ErrorCode.FILEUPLOAD_ERROR, exceptionMessage);
    }

    @Override
    public ModuleCode getModuleCode() {
        return ModuleCode.FILE;
    }

    public FileUploadException(String exceptionMessage, Throwable throwable) {

        super(ErrorCode.FILEUPLOAD_ERROR, exceptionMessage, throwable);
    }

}
