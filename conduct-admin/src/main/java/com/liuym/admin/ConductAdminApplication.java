package com.liuym.admin;

import com.ec.corpcommon.logger.ApolloListenLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
@ImportResource(locations = {"classpath:applicationContext.xml"})
@EnableCaching(proxyTargetClass = true)
public class ConductAdminApplication {

    @Bean
    public ApolloListenLogger apolloListenLogger() {
        return new ApolloListenLogger();
    }
    public static void main(String[] args) {
        SpringApplication.run(ConductAdminApplication.class);
    }
}
