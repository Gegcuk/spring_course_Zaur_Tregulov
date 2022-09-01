package ru.gegcuk.aop;

import org.springframework.stereotype.Component;

@Component("stateLibraryBean")
public class StateLibrary extends AbstractLibrary{
    @Override
    public void addBook() {
        System.out.println("School Library: book added");
    }

    @Override
    public void deleteBook() {
        System.out.println("School Library: book deleted");
    }

    public void getBook(){
        System.out.println("School Library: book has got");
    }

    @Override
    public void returnBook() {
        System.out.println("School Library: book returned");
    }

    @Override
    public void addMagazine() {
        System.out.println("School Library: magazine added");
    }

    @Override
    public void returnMagazine() {
        System.out.println("School Library: magazine returned");
    }

    @Override
    public void getMagazine() {
        System.out.println("School Library: magazine has got");
    }

    @Override
    public void deleteMagazine() {
        System.out.println("School Library: magazine deleted");
    }
}
