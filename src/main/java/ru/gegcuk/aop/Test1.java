package ru.gegcuk.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        String[] beans = context.getBeanDefinitionNames();
        for(String s: beans){
            System.out.println(s);
        }

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        library.getBook();
        library.getMagazine();
        library.getMagazine();
        library.returnBook();
        library.returnMagazine();

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();

        context.close();
    }
}
