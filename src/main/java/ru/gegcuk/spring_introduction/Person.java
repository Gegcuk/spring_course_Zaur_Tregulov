package ru.gegcuk.spring_introduction;

public class Person {
    private Pet pet;
    private String lastName;
    private int age;

    public Person(){
        System.out.println("Person is created");
    }

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
