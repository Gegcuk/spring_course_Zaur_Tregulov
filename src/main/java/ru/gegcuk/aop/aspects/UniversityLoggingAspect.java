package ru.gegcuk.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ru.gegcuk.aop.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println(" beforeGetStudentsLoggingAdvice : logging of students before getStudents" );
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
        System.out.println(students.get(1));
        System.out.println(" afterReturningGetStudentsLoggingAdvice : logging of students after getStudents" );
    }

    @AfterThrowing("execution(* getStudents())")
    public void afterThrowingGetStudents(){
        System.out.println("afterThrowingGetStudents logged");
    }

}
