package ru.gegcuk.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UniversityTestClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfigFile.class);


        UniversityLibrary library = context.getBean("libraryBean", UniversityLibrary.class);

        System.out.println(library.bookName());§

       context.close();
    }

}
