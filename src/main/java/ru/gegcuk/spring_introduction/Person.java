package ru.gegcuk.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.lastName}")
    private String lastName;
    @Value("${person.age}")
    private int age;

    public Person(){
        System.out.println("Person is created");
    }

//    @Autowired
    public Person(Pet pet){
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        System.out.println("Pet is set");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, pet!");
        pet.say();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
