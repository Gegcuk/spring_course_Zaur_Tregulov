package ru.gegcuk.aop;

import org.springframework.stereotype.Component;
import ru.gegcuk.aop.aspects.AbstractLibrary;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook(){
        System.out.println("getBook in UniLibrary");
    }

    public void getMagazine(){
        System.out.println("getBook in UniLibrary");
    }
}
