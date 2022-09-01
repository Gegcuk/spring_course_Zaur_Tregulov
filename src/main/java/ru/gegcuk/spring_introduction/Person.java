package ru.gegcuk.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private Pet pet;
    private String Surname;
    private int age;

//    public Person(){
//        System.out.println("Person creating...\n");
//    }

    @Autowired
    public Person(Pet pet){
        System.out.println("Person with Pet parameter creating");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my pet!");
        pet.say();
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
