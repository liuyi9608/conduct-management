package com.liuym.classes;

import com.ec.corpcommon.logger.ApolloListenLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class})
@ImportResource(locations = {"classpath:applicationContext.xml"})
//@EnableDiscoveryClient
@EnableCaching(proxyTargetClass = true)
@EnableTransactionManagement
public class ConductClassApplication {
    private static Logger logger = LoggerFactory.getLogger(ConductClassApplication.class);

    @Bean
    public ApolloListenLogger apolloListenLogger() {
        return new ApolloListenLogger();
    }
    public static void main(String[] args) {
        SpringApplication.run(ConductClassApplication.class, args);
        logger.info("app is running ...");
    }
}
