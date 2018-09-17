package com.liuym.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * 类功能
 *
 * @Package:
 * @datetime: 2018/8/7 17:30
 * @author: lk
 * @copyright: ec
 */
public class ValidationUtils {

    /**
     * 手机号正则
     */
    private static final String REGEX_MOBILE_STRICT = "/^1[3|4|5|6|7|8|9][0-9]\\d{8}$/";
    private static final String REGEX_MOBILE_COMMON = "/^\\d{10,20}$/";

    /**
     * 是否手机号码，提供严格和通用模式
     *
     * @param mobile 手机号
     * @param strict true 通用模式， false 严格模式
     */
    public static boolean isMobile(String mobile, boolean strict) {
        String regex = REGEX_MOBILE_COMMON;
        if (false == strict) {
            regex = REGEX_MOBILE_STRICT;
        }
        return match(regex, mobile);
    }

    /**
     * 过滤企业名不合法的字符
     *
     * @param corpName 企业名
     * @return
     */
    public static String filterCorpName(String corpName) {
        if (StringUtils.isEmpty(corpName)) {
            return corpName;
        }

        String[] schListStr = new String[]{"	", " ", "\t", "\n", "\r", "\'", "\""};
        String[] replaceListStr = new String[7];
        // 批量过滤
        return StringUtils.replaceEach(corpName, schListStr, replaceListStr).trim();
    }

    /**
     * 统一正则验证
     *
     * @param regex 正则表达式
     * @param str 需要验证的数据
     */
    private static boolean match(String regex, String str) {
        return Pattern.compile(regex).matcher(str).matches();
    }
}
