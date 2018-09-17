package com.liuym.common.exception;

import com.liuym.common.constants.ResponseCodeConstants;

public class CorpProtectException extends ServiceException {
    
    public CorpProtectException(int code, String msg) {
        super(code,msg);
    }

    public static CorpProtectException internalServerError() {
        return new CorpProtectException(ResponseCodeConstants.INTERNAL_SERVER_ERROR_CODE, ResponseCodeConstants.INTERNAL_SERVER_ERROR_MSG);
    }
    
}
