package com.liuym.common.exception;

import com.liuym.common.constants.ResponseCodeConstants;

public class ConductClassException extends ServiceException {

    public ConductClassException(int code, String msg) {
        super(code,msg);
    }

    public static ConductClassException internalServerError() {
        return new ConductClassException(ResponseCodeConstants.INTERNAL_SERVER_ERROR_CODE,
                ResponseCodeConstants.INTERNAL_SERVER_ERROR_MSG);
    }
    
}
