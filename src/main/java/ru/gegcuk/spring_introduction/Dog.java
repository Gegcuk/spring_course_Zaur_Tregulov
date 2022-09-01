package ru.gegcuk.spring_introduction;

//@Component
public class Dog implements Pet {
    public Dog(){
        System.out.println("Dog creating...\n");
    }


    @Override
    public void say(){
        System.out.println("Wow!");
    }
}
