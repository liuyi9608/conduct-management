package com.liuym.common.constants;

import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/**
 * 企业服务模块全局业务常量定义
 *
 * @Package:
 * @datetime: 2018/8/7 14:04
 * @author: lk
 * @copyright: ec
 */
public class Constants {

    /**
     * 默认字符集
     */
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    public static final String DEFAULT_CHARSET_STR = "utf-8";
    /**
     * 日期和时间格式化
     */
    public static final String YMD = "yyyy-MM-dd";
    public static final String YMDHMS = "yyyy-MM-dd HH:mm:ss";
    public static final String ERA_TIME = "1970-01-01 00:00:00";
    public static final SimpleDateFormat YMD_SDF = new SimpleDateFormat(Constants.YMD);
    public static final SimpleDateFormat YMDHMS_SDF = new SimpleDateFormat(Constants.YMDHMS);
    /**
     * 空字符表示
     */
    public static final String EMPTY_STRING = "";
    public static final String SEPECIAL_WHITE_SPACE = " ";
    /**
     * 查询条数限制
     */
    public static final int LENGTH_LIMIT_100 = 100;
    public static final int LENGTH_LIMIT_150 = 150;
    public static final int LENGTH_LIMIT_300 = 300;
    /**
     * 错误日志打印格式
     */
    public static final String NORMAL_MESSAGE = " ====> [操作：%s], Params:[%s], Msg:%s";
    /**
     * 企业 ID
     */
    public static final String AUTH_CORP_ID = "AUTH_CORP_ID";
    /**
     * 用户 ID
     */
    public static final String AUTH_USER_ID = "AUTH_USER_ID";
    /**
     * 间隔符号
     */
    public static final String DELIMITER_COMMA = ",";
    public static final String DELIMITER_ARROW = "=>";
    /**
     * 获取 IP
     */
    public static final String REMOTE_ADDR_HEADER = "x-forwarded-for";
    /**
     * 保留一位小数
     */
    public static final DecimalFormat df = new DecimalFormat("######0.0");
    /**
     * 分页参数 默认初始页
     */
    public static final String PAGE_PAGE = "1";
    /**
     * 分页参数 默认每一页的数量
     */
    public static final String PAGE_LIMIT = "5";
    /**
     * 企业创始人
     */
    public static final String ROLE_CORP_FOUNDER = "9";

}
