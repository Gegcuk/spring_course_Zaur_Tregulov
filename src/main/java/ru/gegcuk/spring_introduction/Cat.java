package ru.gegcuk.spring_introduction;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Mew-mew");
    }
}
