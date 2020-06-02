package spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args){
        // load the spring config files
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // load the bean from the spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        
        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call the fortune service
        System.out.println(theCoach.getDailyFortune());
        
        // close the context
        context.close();
    }
}
