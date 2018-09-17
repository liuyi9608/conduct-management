package com.liuym.common.constants;

/**
 * 类功能
 *
 * @Package:
 * @datetime: 2018/8/7 14:22
 * @author: lk
 * @copyright: ec
 */
public class RedisConstants {

    // key基本格式：项目名:相关表名:唯一键  eg: "uc:ua:2160410"

    //指定企业推送公共用:blt_to_#corpId_2 (该键值php已定，故未按上述格式)
    public static final String CI_BLT_CID_KEY = "blt_to_%s_2";
}
