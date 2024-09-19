package ru.gegcuk.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("aroundReturnBookAdvice");
        long begin = System.currentTimeMillis();
        Object targetMethodResult;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("diagnose");
        long i = 0;
        for(; i < 10000000000l; i++){
            i++;
        }
        long end = System.currentTimeMillis();



        System.out.println("aroundReturnBookAdvice ended in: " + (end - begin) + "ms" + end + " , " + begin);
        return targetMethodResult;
    }
}
