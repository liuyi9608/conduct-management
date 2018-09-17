/**
 * Project Name:autoJob
 * File Name:StringUtils.java
 * Package Name:com.ec.autojob.util
 * Date:2015年6月24日上午11:22:23
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
 */
package com.liuym.common.utils;

import java.io.IOException;

/**
 * ClassName:StringUtils <br/>
 * Function: 字符串工具类
 *
 * <br/>
 * Date: 2015年6月24日 上午11:22:23 <br/>
 *
 * @author xxg
 * @version
 * @since JDK 1.7
 * @see
 */
public class StringUtils {

    /**
     *
     * isNullString:(这里用一句话描述这个方法的作用). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     *
     * @author xxg
     * @param input
     * @return
     * @since JDK 1.7
     */
    public static boolean isEmptyString(String input) {
        return (input == null || "".equals(input.trim()));
    }


    public static void main(String[] args) throws IOException {
    }
}
