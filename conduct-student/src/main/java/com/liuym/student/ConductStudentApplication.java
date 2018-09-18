package com.liuym.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
@ImportResource(locations = {"classpath:applicationContext.xml"})
public class ConductStudentApplication {
    private static Logger logger = LoggerFactory.getLogger(ConductStudentApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConductStudentApplication.class);
        logger.info("app is running ...");
    }
}
