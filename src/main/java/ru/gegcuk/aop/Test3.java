package ru.gegcuk.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        System.out.println("Start");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String returnBook = uniLibrary.returnBook();
        System.out.println("Returned: " + returnBook);


        context.close();
        System.out.println("End");
    }

}
