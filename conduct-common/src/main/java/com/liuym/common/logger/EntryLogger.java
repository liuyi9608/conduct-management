package com.liuym.common.logger;


import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EntryLogger {

    private static final Logger log = LoggerFactory.getLogger(EntryLogger.class);

    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        //String packageLevel = pjp.getTarget().getClass().getName().replaceAll(".*\\.","");
        log.info(LoggerHelper.METHOD_ENTRY_MESSAGE, pjp.getSignature(), pjp.getArgs());
        return pjp.proceed();
    }
}
