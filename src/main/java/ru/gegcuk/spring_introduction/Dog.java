package ru.gegcuk.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("singleton")
public class Dog implements Pet{

    private String name;

    public void init(){
        System.out.println("Class Dog: init method");
    }

    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }

    public Dog(){
        System.out.println("Dog is created");
    }

    @Override
    public void say(){
        System.out.println("Woof-woof");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
