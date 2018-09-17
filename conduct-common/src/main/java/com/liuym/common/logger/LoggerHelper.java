package com.liuym.common.logger;

import java.util.UUID;

/**
 *
 * @ClassName: LoggerHelper
 * @Description: TODO
 * @author ecuser
 * @date 2016年11月7日 上午10:22:32
 */

public class LoggerHelper {

    public static enum OptType {
        IsNull, IsEmpty, NumberFormat, DataIssue, Query, Insert, Update, Delete, IMNotify, Set, Get, Del, Expire, Execute;
    }

    public static final String METHOD_ENTRY_MESSAGE = " [方法调用]>>>> Method:{}, Args:{}";
    public static final String METHOD_EXIT_MESSAGE = " [方法返回]>>>> Method:{}, Args:{}, Result:{}";
    public static final String METHOD_PERFORMANCE_MESSAGE = " [执行时间]>>>> Method:{}, Args:{}, Used Time:{}";
    public static final String METHOD_ERROR_MESSAGE = " ====> Method:%s";
    public static final String NORMAL_MESSAGE = " ====> [操作：%s], Params:[%s], Msg:%s";
    public static final String NORMAL_ROW_MESSAGE = " ====> [操作：%s], Params:[%s], Rows:%d, Msg:%s";
    public static final String NORMAL_RESULT_MESSAGE = " ====> [操作：%s], Params:[%s], Msg:%s, Result:[%s]";
    public static final String NORMAL_ROW_RESULT_MESSAGE = " ====> [操作：%s], Params:[%s], Rows:%d, Msg:%s, Result:[%s]";

    public static String newRequestId() {
        return UUID.randomUUID().toString();
    }

    public static String getErrorMessage(String method) {
        return String.format(METHOD_ERROR_MESSAGE, method);
    }

    public static String getNormalMessage(OptType optType, String params, String msg) {
        return String.format(NORMAL_MESSAGE, optType, params, msg);
    }

    public static String getNormalMessage(OptType optType, String params, long rows, String msg) {
        return String.format(NORMAL_ROW_MESSAGE, optType, params, rows, msg);
    }

    public static String getNormalMessage(OptType optType, String params, String msg, String result) {
        return String.format(NORMAL_RESULT_MESSAGE, optType, params, msg, result);
    }

    public static String getNormalMessage(OptType optType, String params, long rows, String msg, String result) {
        return String.format(NORMAL_ROW_RESULT_MESSAGE, optType, params, rows, msg, result);
    }
}
