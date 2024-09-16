package ru.gegcuk.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* ru.gegcuk.aop.UniLibrary.*(..))")
    private void allMethodsInUniLibrary() {}

    @Pointcut("execution(public void ru.gegcuk.aop.UniLibrary.returnMagazine())")
    private void returnMagazineInUniLibrary() {}

    @Pointcut("allMethodsInUniLibrary() && !returnMagazineInUniLibrary()")
    private void allMethodsExceptReturnMagazineInUniLibrary() {}


    @Before("allMethodsExceptReturnMagazineInUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineInUniLibrary(){
        System.out.println("beforeAllMethodsExceptReturnMagazineInUniLibrary: logging #4");
    }

//    @Before("returnMagazineInUniLibrary()")
//    public void beforeReturnMagazineInUniLibrary(){
//        System.out.println("beforeReturnMagazineInUniLibrary: logging#5");
//    }
}


//    @Pointcut("execution(* ru.gegcuk.aop.UniLibrary.get*())")
//    private void allGetMethodsInUniLibrary(){
//    }
//
//    @Pointcut("execution(* ru.gegcuk.aop.UniLibrary.return*())")
//    private void allReturnMethodsInUniLibrary(){
//    }
//
//    @Pointcut("allGetMethodsInUniLibrary() || allReturnMethodsInUniLibrary()" )
//    private void allGetAndReturnMethodsInUniLibrary(){
//    }
//
//    @Before("allGetMethodsInUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: Logging #1");
//    }
//
//    @Before("allReturnMethodsInUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: Logging #2");
//    }
//
//    @Before("allGetAndReturnMethodsInUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: Logging #3");
//    }
//

//}
