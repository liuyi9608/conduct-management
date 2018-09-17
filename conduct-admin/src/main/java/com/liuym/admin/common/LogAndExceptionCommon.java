package com.liuym.admin.common;

import com.ec.corpcommon.exception.CorpProtectException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author LiuYiMing
 * @date 2018/9/4 10:53
 * @describe：
 */
public class LogAndExceptionCommon {
    private static final Logger logger = LoggerFactory.getLogger(LogAndExceptionCommon.class);

    public static void recordLogAndThrowException(int code, String msg, Object msgParam)
            throws CorpProtectException {
        CorpProtectException corpInfoException = null;
        if (StringUtils.isEmpty(msgParam.toString())) {
            corpInfoException = new CorpProtectException(code, msg);
        } else {
            corpInfoException = new CorpProtectException(code, String.format(msg, msgParam));
        }
        logger.error(corpInfoException.toString());
        throw corpInfoException;
    }
}
