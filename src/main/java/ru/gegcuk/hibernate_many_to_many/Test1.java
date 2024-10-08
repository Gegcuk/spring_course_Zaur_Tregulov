package ru.gegcuk.hibernate_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.gegcuk.hibernate_many_to_many.entity.Child;
import ru.gegcuk.hibernate_many_to_many.entity.Class;


public class Test1 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Class.class)
                .buildSessionFactory()){
            try(Session session = factory.getCurrentSession()){

                Class section1 = new Class("Football");
                Class section2 = new Class("Chess");
                Class section3 = new Class("Tennis");

                Child child1 = new Child("Masha", 10);
                Child child2 = new Child("Misha", 12);
                Child child3 = new Child("Anna", 13);

                section1.addChildToCLass(child1);
                section1.addChildToCLass(child2);
                section1.addChildToCLass(child3);

                section2.addChildToCLass(child2);
                section2.addChildToCLass(child3);

                section3.addChildToCLass(child1);
                section3.addChildToCLass(child2);

                session.beginTransaction();
                session.persist(section1);
                session.persist(section2);
                session.persist(section3);
                session.getTransaction().commit();
                System.out.println("Done!");
            }
        }
    }
}
