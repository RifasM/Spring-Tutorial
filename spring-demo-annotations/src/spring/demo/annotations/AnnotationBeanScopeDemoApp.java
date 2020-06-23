package spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // Check if they are same
        boolean result = (theCoach == alphaCoach);

        // Print results
        System.out.println("Pointing to same object: "+result);
        System.out.println("Memory Location theCoach: "+ theCoach);
        System.out.println("Memory Location alphaCoach: "+ theCoach);

        // Close Context
        context.close();
    }
}
