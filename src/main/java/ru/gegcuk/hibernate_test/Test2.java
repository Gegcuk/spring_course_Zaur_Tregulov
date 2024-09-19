package ru.gegcuk.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.gegcuk.hibernate_test.Entity.Employee;

public class Test2 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()){
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Anna", "Lazunina", "Finance", 255000);
            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();

            int id = employee.getId();
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee2 = session.get(Employee.class, id);
            session.getTransaction().commit();

            System.out.println(employee2);
        }
    }
}
