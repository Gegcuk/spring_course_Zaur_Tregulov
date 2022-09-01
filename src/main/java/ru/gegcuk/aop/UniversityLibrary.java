package ru.gegcuk.aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class UniversityLibrary extends AbstractLibrary{
    @Override
    public void addBook() {
        System.out.println("University Library: book added");
    }

    @Override
    public void deleteBook() {
        System.out.println("University Library: book deleted");
    }

    public void getBook(){
        System.out.println("University Library: book has got");
    }

    @Override
    public void returnBook() {
        System.out.println("University Library: book returned");
    }

    @Override
    public void addMagazine() {
        System.out.println("University Library: magazine added");
    }

    @Override
    public void returnMagazine() {
        System.out.println("University Library: magazine returned");
    }

    @Override
    public void getMagazine() {
        System.out.println("University Library: magazine has got");
    }

    @Override
    public void deleteMagazine() {
        System.out.println("University Library: magazine deleted");
    }

    public String bookName(){
        System.out.println("We are in book name method");
        return "The war and the peace";
    }
}
