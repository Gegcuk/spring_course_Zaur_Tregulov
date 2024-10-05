package ru.gegcuk.hibernate_test2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.gegcuk.hibernate_test2.entity.Detail;
import ru.gegcuk.hibernate_test2.entity.Employee;

public class Test1 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory(); Session session = factory.getCurrentSession()){
//            Employee employee = new Employee("Anna", "Lazunina", "Finance", 250000);
//            Detail detail = new Detail("London", "123456712", "anna@gmail.com");
//            employee.setEmpDetail(detail);
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 1);
            System.out.println(emp.getEmpDetail());

//            session.persist(employee);



            session.getTransaction().commit();
        }
    }
}
