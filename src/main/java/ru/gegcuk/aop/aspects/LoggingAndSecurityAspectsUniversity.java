package ru.gegcuk.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import ru.gegcuk.aop.Student;

import java.util.List;

@Component
@Aspect

public class LoggingAndSecurityAspectsUniversity {

    @Before("execution (* get*(..))")
    public void beforeAllGetMethodsAdvice(){
        System.out.println("beforeAllGetMethodsAdvice: check students");
    }

    @AfterReturning(pointcut=("execution(* get*(..))"), returning = "students")
    public void afterAllGetMethodsAdvice(List<Student> students){
        for(Student s : students){
            s.setName("Prefix " + s.getName());
        }
    }

    @Around("execution (String bookName())")
    public Object returnBookNameAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("We are in the around aspects");

        long begin = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        long ens = System.currentTimeMillis();

        System.out.println("We are in the around aspects");
        System.out.println("Time of execution: " + (ens - begin));

        return result;
    }
}
