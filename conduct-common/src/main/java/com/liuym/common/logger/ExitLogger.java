package com.liuym.common.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ExitLogger {

    private static final Logger log = LoggerFactory.getLogger(ExitLogger.class);

    @SuppressWarnings("rawtypes")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        Object retVal = pjp.proceed();
        //String packageLevel = pjp.getTarget().getClass().getName().replaceAll(".*\\.","");
        log.info(LoggerHelper.METHOD_EXIT_MESSAGE, pjp.getSignature(), pjp.getArgs(), retVal);
        return retVal;
    }
}
