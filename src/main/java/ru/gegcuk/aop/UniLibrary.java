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
        System.out.println("getMagazine in UniLibrary");  // Fixed typo here
    }

    public String returnBook(){
        System.out.println("returnBook in UniLibrary");
        return "The war and the piece";
    }

    public void returnMagazine(){
        System.out.println("returnMagazine in UniLibrary");
    }

    public void addBook(){
        System.out.println("addBook in UniLibrary");  // Fixed typo here
    }

    public void addMagazine(){
        System.out.println("addMagazine in UniLibrary");
    }
}