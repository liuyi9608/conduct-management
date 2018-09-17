package com.liuym.common.exception;

import com.liuym.common.constants.ResponseCodeConstants;

/**
 * CorpBizException 处理企业商机异常
 *
 * @version:
 * @datetime: 2018/9/6 14:07
 * @author: yansen
 * @copyright: ec
 */
public class CorpBizException extends ServiceException {
    public CorpBizException(int code, String msg) {
        super(code,msg);
    }

    public static CorpBizException internalServerError() {
        return new CorpBizException(ResponseCodeConstants.INTERNAL_SERVER_ERROR_CODE, ResponseCodeConstants.INTERNAL_SERVER_ERROR_MSG);
    }
}
