package spring.demo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // Read Spring Config Java Class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Get Bean from Spring Container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);    // default beanID

        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}
