package com.liuym.common.utils;

import com.liuym.common.constants.Constants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class DateUtils {

    private static ThreadLocal<DateFormat> dataFormatYMD = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat(Constants.YMD);
        }
    };

    private static ThreadLocal<DateFormat> dataFormatYMDHMS = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat(Constants.YMDHMS);
        }
    };

    public static int getCurrentTimestamp() {
        return new Long(Instant.now().getEpochSecond()).intValue();
    }

    public static String convertDate2YMDString(Date date) {
        return dataFormatYMD.get().format(date);
    }

    public static String convertDate2YMDHMSString(Date date) {
        return dataFormatYMDHMS.get().format(date);
    }

    public static Date convertYMDString2Date(String dateStr) throws Exception {
        return dataFormatYMD.get().parse(dateStr);
    }

    public static Date convertYMDHMSString2Date(String dateStr) throws Exception {
        return dataFormatYMDHMS.get().parse(dateStr);
    }

    public static void main(String[] args) throws Exception {
//        getCurrentTimestamp();
        System.out.println(convertYMDHMSString2Date("1970-01-01 00:00:00"));
    }
}
