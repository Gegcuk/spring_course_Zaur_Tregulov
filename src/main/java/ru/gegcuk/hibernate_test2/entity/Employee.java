package ru.gegcuk.hibernate_test2.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String lastName;

    @Column(name="department")
    private String department;

    @Column(name="salary")
    private int salary;

    public Detail getEmpDetail() {
        return empDetail;
    }

    public void setEmpDetail(Detail empDetail) {
        this.empDetail = empDetail;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private Detail empDetail;

    public Employee(){
    }

    public Employee(String name, String lastName, String department, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", Salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

