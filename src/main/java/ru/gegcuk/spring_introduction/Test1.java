package ru.gegcuk.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        Pet pet1 = (Pet) context.getBean("myPet");

        pet.say();
        pet1.say();

        context.close();
    }
}
