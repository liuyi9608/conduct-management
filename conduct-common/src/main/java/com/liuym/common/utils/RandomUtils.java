package com.liuym.common.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 类功能
 *
 * @Package:
 * @datetime: 2018/8/7 17:50
 * @author: lk
 * @copyright: ec
 */
public class RandomUtils {

    //随机密码经过多次迭代，最终如下：大写，小写，数字，8位
    private static StringBuffer alphabetUpper = new StringBuffer("ABCDEFGHJKLMNPQRSUVWXYZ");//23个，不包含I,O,T
    private static StringBuffer alphabet = new StringBuffer("abcdefghijkmnpqresuvwxyz");//24个，不包含l,o
    private static StringBuffer number = new StringBuffer("12345689");//8个，不包含0,7
    //    private static StringBuffer punctuation = new StringBuffer("!\"#$%&'()*+,-./:;<=>?@[]^_`{}~");//30个，不包含|和\
//    private static StringBuffer alphabetnumber = new StringBuffer("abcdefghijkmnpqresuvwxyz123456789");
    private static StringBuffer alphabetnumberpunctuation = new StringBuffer("ABCDEFGHJKLMNPQRSUVWXYZabcdefghijkmnpqresuvwxyz12345689");//55=23+24+8
//    private static StringBuffer alphabetnumberpunctuation = new StringBuffer("ABCDEFGHJKLMNOPQRSTUVWXYZabcdefghijkmnopqresuvwxyz0123456789!\"#$%&'()*+,-./:;<=>?@[]^_`{}~");

    private final static String SPECIAL_CHAR = "!\"#$%&'()*+,-./:;<=>?@[]^_`{}~";
    private static Map<Integer, String> modeMap = new HashMap<Integer, String>() {
        {
            put(1, "1234567890");
            // 去掉小写 L 字符
            put(2, "abcdefghijkmnopqrstuvwxyz");
            // 去掉大写 i 字符
            put(3, "ABCDEFGHJKLMNOPQRSTUVWXYZ");
            put(4, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
            put(5, "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
            put(6, "ABCDEFGHJKLMNOPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz1234567890");
            // 去掉小写 L 及大写 i 字符及特殊字符中 | 竖线字符
            put(7, "ABCDEFGHJKLMNOPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz1234567890" + SPECIAL_CHAR);
            put(8, SPECIAL_CHAR);
            put(9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890");
        }
    };

    /**
     * 根据指定的有序字符串随机生成指定长度的随机字符串
     *
     * @param len  生成的字符串长度
     * @param mode 根据哪种字符序列 modeMap 来生成随机串
     * @return
     */
    public static String getRndStr(int len, int mode) {
        if (0 == len) {
            return "";
        }
        if (0 == mode) {
            mode = 9;
        }
        if (null != modeMap.get(Integer.valueOf(mode))) {
            String defaultRndStr = modeMap.get(Integer.valueOf(mode));
            int defaultRndStrLen = defaultRndStr.length();
            StringBuffer strBuff = new StringBuffer();
            Random rnd = new Random();
            for (int i = 0; i < len; i++) {
                // 随机生成一个数字
                int rndNum = rnd.nextInt(defaultRndStrLen);
                strBuff.append(defaultRndStr.charAt(rndNum));
            }
            return strBuff.toString();
        }
        return "";
    }

    public static String getRandomPwd() {
        Random random = new Random();
        StringBuffer tmpbf = new StringBuffer();
        tmpbf.append(alphabet.charAt(random.nextInt(24))).append(number.charAt(random.nextInt(8))).append(alphabetUpper.charAt(random.nextInt(23)));
        for (int i = 0; i < 5; i++) {
            tmpbf.append(alphabetnumberpunctuation.charAt(random.nextInt(55)));
        }
        return tmpbf.toString();
    }


}
