package springBootJsp.springBootJsp.main13;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;

@Slf4j
public class LogAop {

    public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
        String signatureStr = joinPoint.getSignature().toShortString();
        log.info(signatureStr + "is start.");
        long st = System.currentTimeMillis();

        try {
            return joinPoint.proceed();
        } finally {
            long et = System.currentTimeMillis();
            log.info(signatureStr + "is finished.");
            log.info(signatureStr + "경과시간: " + (et - st));
        }
    }
}
