package ru.gegcuk.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("universityBean")
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        students.add(new Student("Zaur Tregulov", 3, 7.3));
        students.add(new Student("Aleksey Lazunin", 5, 8.1));
        students.add(new Student("Anna Zvereva", 4, 9.4));
    }

    public List<Student> getStudents(){
        System.out.println(students.toString());
        return students;
    }

    public Student getStudent(int id){
        System.out.println(students.get(id));
        return students.get(id);
    }

}
