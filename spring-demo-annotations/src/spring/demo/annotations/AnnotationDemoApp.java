package spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // Read Spring Config File
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Bean from Spring Container
        // Coach theCoach = context.getBean("theTennisCoach", Coach.class);     // explicit beanID
        Coach theCoach = context.getBean("tennisCoach", Coach.class);    // default beanID

        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // Close the context
        context.close();
    }
}
