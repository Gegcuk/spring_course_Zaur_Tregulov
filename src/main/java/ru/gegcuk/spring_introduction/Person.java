package ru.gegcuk.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {

    private Pet pet;
    private Integer age;
    private String lastName;

//    @Autowired
    public Person(/*@Qualifier("catBean")*/ Pet pet) {
        this.pet = pet;
        System.out.println("Person is created");
    }

    public void callYourPet() {
        System.out.println("Hello, pet!");
        pet.say();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
