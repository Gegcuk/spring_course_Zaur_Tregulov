package ru.gegcuk.aop;

public class Student {

    private String name;
    private int grade;
    private double avgGrade;

    public Student(String name, int grade, double avgGrade) {
        this.name = name;
        this.grade = grade;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
