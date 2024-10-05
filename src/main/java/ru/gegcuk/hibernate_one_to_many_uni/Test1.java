package ru.gegcuk.hibernate_one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.gegcuk.hibernate_one_to_many_uni.entity.Department;
import ru.gegcuk.hibernate_one_to_many_uni.entity.Employee;

public class Test1 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cdg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory()){
            Session session = factory.getCurrentSession();
            session.beginTransaction();





            session.getTransaction().commit();
        }
    }
}
