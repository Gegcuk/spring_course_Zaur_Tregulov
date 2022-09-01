package ru.gegcuk.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLibrary {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfigFile.class);
        AbstractLibrary universityLibrary = context.getBean("libraryBean", AbstractLibrary.class);
        AbstractLibrary schoolLibrary = context.getBean("schoolLibraryBean", AbstractLibrary.class);
        AbstractLibrary stateLibrary = context.getBean("stateLibraryBean", AbstractLibrary.class);



        context.close();
    }
}
