package ru.gegcuk.aop;

import org.springframework.stereotype.Component;
import ru.gegcuk.aop.aspects.AbstractLibrary;

@Component
public class SchoolLibrary extends AbstractLibrary {
    @Override
    public void getBook(){
        System.out.println("getBook in SchoolLibrary");
    }
}
