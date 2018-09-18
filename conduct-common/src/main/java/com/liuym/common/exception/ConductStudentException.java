package com.liuym.common.exception;

import com.liuym.common.constants.ResponseCodeConstants;

public class ConductStudentException extends ServiceException {

    public ConductStudentException(int code, String msg) {
        super(code,msg);
    }

    public static ConductStudentException internalServerError() {
        return new ConductStudentException(ResponseCodeConstants.INTERNAL_SERVER_ERROR_CODE,
                ResponseCodeConstants.INTERNAL_SERVER_ERROR_MSG);
    }
    
}
