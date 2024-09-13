package ru.gegcuk.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");
        yourDog.setName("Strelka");

        System.out.println("myDog == yourDog - " + (myDog == yourDog));
        System.out.println("myDog - " + myDog.getName());
        System.out.println("yourDog - " + yourDog.getName());
        context.close();
    }
}
