package com.liuym.common.logger;


import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @ClassName: PerformanceLogger
 * @Description: TODO
 * @author ecuser
 * @date 2016年11月7日 上午10:20:45
 */

public class PerformanceLogger {

    private static final Logger log = LoggerFactory.getLogger(PerformanceLogger.class);

    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        try {
            return pjp.proceed();
        } finally {
            long end = System.currentTimeMillis();
            long usedTime = end - start;
            //String packageLevel = pjp.getTarget().getClass().getName().replaceAll(".*\\.","");
            log.info(LoggerHelper.METHOD_PERFORMANCE_MESSAGE, pjp.getSignature(), pjp.getArgs(), usedTime + "ms");
        }
    }
}
