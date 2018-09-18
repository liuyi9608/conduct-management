package com.liuym.common.exception;

import com.liuym.common.constants.ResponseCodeConstants;


public class ConductAdminException extends ServiceException {

    public ConductAdminException(int code, String msg) {
        super(code, msg);
    }

    public static ConductAdminException internalServerError() {
        return new ConductAdminException(ResponseCodeConstants.INTERNAL_SERVER_ERROR_CODE,
                ResponseCodeConstants.INTERNAL_SERVER_ERROR_MSG);
    }
}
