package ru.gegcuk.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        // List all beans registered in the context
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        Pet cat1 = context.getBean("catBean", Pet.class);
        Pet cat2 = context.getBean("catBean", Pet.class);

        cat1.say();
        cat2.say();

//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();


        context.close();
    }
}
