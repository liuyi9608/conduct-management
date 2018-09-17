package com.liuym.common.constants;

/**
 * 类功能
 *
 * @Package:
 * @datetime: 2018/8/7 14:22
 * @author: lk
 * @copyright: ec
 */
public class ResponseCodeConstants {

    public static final String CODE = "code";
    public static final String MSG = "msg";
    public static final String DATA = "data";

    public static final int SUCCESS_CODE = 200;
    public static final String SUCCESS_MSG = "success";

    public static final int ACCOUNT_EXIST_CODE = 40200;
    public static final String ACCOUNT_EXIST_MSG = "手机号已存在";

    public static final int REQUIRED_PARAMETER_MISSING_CODE = 40400;
    public static final String REQUIRED_PARAMETER_MISSING_MSG = "[%s]不能为空";
    public static final int PARAMETER_INVALID_CODE = 40401;
    public static final String PARAMETER_INVALID_MSG = "[%s]参数不合法";
    public static final int PARAMETER_NOT_ALLOW_0_CODE = 40402;
    public static final String PARAMETER_NOT_ALLOW_0_MSG = "[%s]不能为0";
    public static final int CORP_NAME_EXIST_CODE = 40411;
    public static final String CORP_NAME_EXIST_MSG = "企业全称已存在";
    public static final int EXIST_VALID_PROTECT_CODE = 40412;
    public static final String EXIST_VALID_PROTECT_MSG = "已存在有效的客户保护";
    public static final int PROTECT_NUM_NOT_ENOUGH_CODE = 40413;
    public static final String PROTECT_NUM_NOT_ENOUGH_MSG = "无客户保护名额";
    public static final int NOT_IN_AGENT_PROTECT_AREA_CODE = 40414;
    public static final String NOT_IN_AGENT_PROTECT_AREA_MSG = "客户不在代理商保护区域内";
    public static final int BEYOND_PROTECTED_TOTAL_CODE = 40415;
    public static final String BEYOND_PROTECTED_TOTAL_MSG = "已经达到保护客户数量的上限 '%s' 个，不能添加";
    public static final int CORP_HAVE_PROTECTED_BY_ME_CODE = 40416;
    public static final String CORP_HAVE_PROTECTED_BY_ME_MSG = "已存在该保护企业,不能添加";
    public static final int CORP_HAVE_PROTECTED_CODE = 40417;
    public static final String CORP_HAVE_PROTECTED_MSG = " 已被其他代理商保护,不能增加";
    public static final int BEYOND_PROTECTED_AREA_CODE = 40418;
    public static final String BEYOND_PROTECTED_AREA_MSG = " 该企业不在您的销售区域或公共区域内，不能保护";
    public static final int IN_THE_INTREVAL_CODE = 40419;
    public static final String IN_THE_INTREVAL_MSG = "该企业保护尚在'%s'天的间隔期";
    public static final int PROTECT_AREA_IS_NULL_CODE = 40420;
    public static final String PROTECT_AREA_IS_NULL_MSG = "客户保护期限配置获取失败";
    public static final int CORP_HAVE_DEAL_CODE = 40421;
    public static final String CORP_HAVE_DEAL_MSG = "该企业或该手机号对应的企业已经成交，不可保护";
    public static final int CORP_PROTECT_INTERFACE_FAIL = 40422;
    public static final String CORP_PROTECT_INTERFACE_FAIL_MSG = "获取企业客户保护信息失败";

    public static final int INTERNAL_SERVER_ERROR_CODE = 500;
    public static final String INTERNAL_SERVER_ERROR_MSG = "内部服务器错误";

    public static final int EXCEPTION_CODE_NSQ_SEND_FAIL = 401;
    public static final String EXCEPTION_MSG_NSQ_SEND_FAIL = "nsq消息发送失败";

}
