package ru.gegcuk.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getLastName());

        Dog dog1= context.getBean("dog", Dog.class);
        Dog dog2= context.getBean("dog", Dog.class);

        System.out.println(dog1 == dog2);

        context.close();
    }
}
