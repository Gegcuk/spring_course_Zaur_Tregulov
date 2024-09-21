package ru.gegcuk.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.gegcuk.hibernate_test.Entity.Employee;

public class Test5 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()){
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, "9");
//            session.remove(employee);
//            employee = session.get(Employee.class, "4");
//            session.remove(employee);

            session.createMutationQuery("delete Employee e where e.name = :name")
                    .setParameter("name", "Aleksandr")
                    .executeUpdate();


            session.getTransaction().commit();
        }
    }
}
