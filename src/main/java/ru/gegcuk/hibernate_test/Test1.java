package ru.gegcuk.hibernate_test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.gegcuk.hibernate_test.Entity.Employee;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Sergey", "Ivanov", "IT", 250000);
            System.out.println(employee);
            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();
            System.out.println(employee);
        }
    }
}
