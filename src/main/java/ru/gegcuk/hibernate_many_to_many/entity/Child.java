package ru.gegcuk.hibernate_many_to_many.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "children")
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String firsName;

    @Column(name = "age")
    private int Age;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "child_section",
            joinColumns = @JoinColumn(name = "child_id"),
            inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Class> classes;

    public Child() {
    }

    public Child(String firsName, int age) {
        this.firsName = firsName;
        Age = age;
    }

    public void addClassToChild(Class section){
        if(section == null){
            classes = new ArrayList<>();
        }
        classes.add(section);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Child{" +
                "Age=" + Age +
                ", firsName='" + firsName + '\'' +
                ", id=" + id +
                '}';
    }
}
