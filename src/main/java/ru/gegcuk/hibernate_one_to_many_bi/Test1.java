package ru.gegcuk.hibernate_one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.gegcuk.hibernate_one_to_many_bi.entity.Employee;
import ru.gegcuk.hibernate_one_to_many_bi.entity.Department;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory()) {

            try (Session session = factory.getCurrentSession()) {
                session.beginTransaction();
                Employee employee = session.get(Employee.class, 5);

                if(employee != null) session.remove(employee);

                session.getTransaction().commit();


//            Session session = null;
//            session = factory.getCurrentSession();
//            session.beginTransaction();//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());//
//            session.getTransaction().commit();


//            Session session = null;
//            session = factory.getCurrentSession();
//            session.beginTransaction();//
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmployees());
//            session.getTransaction().commit();


//            Session session = null;
//            session = factory.getCurrentSession();
//            Department department = new Department("IT", 300, 1200);
//            Employee employee = new Employee("Zaur", "Tregulov",  500);
//            Employee employee1 = new Employee("Aleksei", "Lazunin",  450);
//            department.addEmployeeToDepartment(employee);
//            department.addEmployeeToDepartment(employee1);
//            session.beginTransaction();
//            session.persist(department);
//            session.getTransaction().commit();
//            System.out.println("Done");

            }
        }
    }
}
