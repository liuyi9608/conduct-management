package com.liuym.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonUtils {

    private static final Logger logger = LoggerFactory.getLogger(CommonUtils.class);

    public static boolean isNullOr0(Number obj) {
        return (null == obj || 0 == obj.intValue()) ? true : false;
    }

    public static boolean isNotNullOr0(Number obj) {
        return (null == obj || 0 == obj.intValue()) ? false : true;
    }

}
