package com.liuym.admin.common;

import com.liuym.common.exception.ConductAdminException;
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
            throws ConductAdminException {
        ConductAdminException conductAdminException = null;
        if (StringUtils.isEmpty(msgParam.toString())) {
            conductAdminException = new ConductAdminException(code, msg);
        } else {
            conductAdminException = new ConductAdminException(code, String.format(msg, msgParam));
        }
        logger.error(conductAdminException.toString());
        throw conductAdminException;
    }
}
