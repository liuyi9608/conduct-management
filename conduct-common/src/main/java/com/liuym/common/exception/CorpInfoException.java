package com.liuym.common.exception;

import com.liuym.common.constants.ResponseCodeConstants;

public class CorpInfoException extends ServiceException {
    
    public CorpInfoException(int code, String msg) {
        super(code,msg);
    }

    public static CorpInfoException internalServerError() {
        return new CorpInfoException(ResponseCodeConstants.INTERNAL_SERVER_ERROR_CODE, ResponseCodeConstants.INTERNAL_SERVER_ERROR_MSG);
    }
    
}
