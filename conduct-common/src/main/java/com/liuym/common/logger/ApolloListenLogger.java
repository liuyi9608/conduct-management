package com.liuym.common.logger;

import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author LiuYiMing
 * @date 2018/9/10 14:31
 * @describe：监听并记录apollo配置中心配置变化信息
 */
public class ApolloListenLogger {

    private static final Logger logger = LoggerFactory.getLogger(ApolloListenLogger.class);

    //config change listener for namespace application
    @ApolloConfigChangeListener({"application", "OPS.nsq.cluster0", "OPS.zookeeper.cluster1",
            "OPS.mysql.base_new.java_admin", "OPS.redis.redis_6379",
            "PLATFORM.springbt-common-springcloud", "PLATFORM.springbt-common-db",
            "PLATFORM.springbt-common-redis", "PLATFORM.springbt-common-nsq"})
    private void anotherOnChange(ConfigChangeEvent changeEvent) {
        for (String key : changeEvent.changedKeys()) {
            ConfigChange change = changeEvent.getChange(key);
            logger.info("Change - key: {}, oldValue: {}, newValue: {}, changeType: {}",
                    change.getPropertyName(), change.getOldValue(), change.getNewValue(),
                    change.getChangeType());
        }
    }
}
