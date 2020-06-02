package spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args){
        // Load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println("Your Daily Workout:\n\t"+theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
