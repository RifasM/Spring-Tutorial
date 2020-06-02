package spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args){
        // Load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check scope
        boolean result = (theCoach == alphaCoach);

        // Check Result
        System.out.println("Scope pointing to same Object:\n\t"+result);

        System.out.println("Memory location for theCoach:\n\t"+theCoach);

        System.out.println("Memory location for alphaCoach:\n\t"+alphaCoach);

        // close the context
        context.close();
    }
}
