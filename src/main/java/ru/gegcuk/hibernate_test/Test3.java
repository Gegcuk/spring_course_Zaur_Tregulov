package ru.gegcuk.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.gegcuk.hibernate_test.Entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()){

            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> employees= session.createQuery("from Employee", Employee.class).getResultList();

            for(Employee e : employees){
                System.out.println(e);
            }

            employees.clear();

            employees = session.createQuery("from Employee " + "where name = 'Sergey'", Employee.class).getResultList();

            for(Employee e : employees){
                System.out.println(e);
            }

            session.getTransaction().commit();

        }
    }
}
