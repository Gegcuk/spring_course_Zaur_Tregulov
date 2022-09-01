package ru.gegcuk.spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{

    public Cat(){
        System.out.println("Cat creating...\n");
    }
    @Override
    public void say() {
        System.out.println("Meow");
    }
}
