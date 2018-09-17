package com.liuym.common.utils;

import org.phprpc.util.AssocArray;
import org.phprpc.util.PHPSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiuYiMing
 * @date 2018/8/8 18:36
 * @describe：用于把PHP序列化的值转成java
 */
public class UnSerializeUtils {
    private static final Logger logger = LoggerFactory.getLogger(UnSerializeUtils.class);
    /**
     * 反序列化PHP数据为Map
     *
     * @param content
     * @return
     */
    public static Map<String, String> unPhpSerializeToArray(String content) {
        Map<String, String> hashMap = new HashMap<String, String>();
        PHPSerializer p = new PHPSerializer();
        if ( content ==null || "".equals(content) )
            return hashMap;
        try {
            //拿到反序列化后的值
            AssocArray array = (AssocArray) p.unserialize(content.getBytes());
            //把的得到的值转化成map
            hashMap = array.toHashMap();
            //遍历这个map，并且处理map的数据
            processingData(hashMap);
        } catch (Exception e) {
            logger.error("error",e);
        }
        return hashMap;
    }

    /**
     * 若value为AssocArray类型的值，则需要进一步解析
     *
     * @param value
     * @return
     */
    public static Map<String, String> analyze(Object value) {
        //把value转化成AssocArray，这样可以使用AssocArray的api
        AssocArray array = (AssocArray) value;
        //把AssocArray转化成map
        Map<String, String> hashMap = array.toHashMap();
        //处理map里的entry
        processingData(hashMap);
        return hashMap;
    }

    public static void processingData(Map<String, String> hashMap){
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            //得到entry的value，value的类型有：Integer、byte、AssocArray，byte需要处理成String，AssocArray需要继续解析
            Object value = entry.getValue();
            if (value instanceof Integer) { //Integer不需要处理
            } else if (value instanceof AssocArray) { //如果为AssocArray，调用analyze函数继续解析后，存入entry
                Map analyze = analyze(value);
                entry.setValue(String.valueOf(analyze));
            } else {
                //把btye类型转化为String后，存入entry
                String s = new String((byte[]) value);
                entry.setValue(s);
            }
            //map的所有entry的value值处理完后，存入map并且返回
            hashMap.put(entry.getKey(), entry.getValue());
        }
    }
}
