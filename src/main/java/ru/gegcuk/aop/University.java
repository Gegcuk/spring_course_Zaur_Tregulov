package ru.gegcuk.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudent(){
        Student student1 = new Student("Lazunin", 4, 7.8);
        Student student2 = new Student("Tregulov", 4, 8.8);
        Student student3 = new Student("Ivanov", 4, 9.8);

        students.add(student1);
        students.add(student2);
        students.add(student3);

    }

    public List<Student> getStudents() {
        return students;
    }
}
