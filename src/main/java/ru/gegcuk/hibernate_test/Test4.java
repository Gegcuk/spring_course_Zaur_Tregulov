package ru.gegcuk.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.gegcuk.hibernate_test.Entity.Employee;

public class Test4 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()){
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 5);
            employee.setSalary(170000);

            session.createMutationQuery("update Employee e set e.salary = :salary where e.name = :name")
                    .setParameter("salary", 277777)
                    .setParameter("name", "Sergey")
                    .executeUpdate();

            session.getTransaction().commit();
        }
    }
}
