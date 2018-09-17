package com.liuym.common.exception;

import com.liuym.common.constants.ResponseCodeConstants;

/**
 * @Auther: WangRui
 * @Date: 2018/9/7 18:46
 * @Description:
 */
public class CorpRecycleException extends ServiceException{
    public CorpRecycleException(int code, String msg) {
        super(code,msg);
    }

    public static CorpRecycleException internalServerError() {
        return new CorpRecycleException(ResponseCodeConstants.INTERNAL_SERVER_ERROR_CODE, ResponseCodeConstants.INTERNAL_SERVER_ERROR_MSG);
    }
}
