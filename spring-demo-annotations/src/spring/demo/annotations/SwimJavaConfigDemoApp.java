package spring.demo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // Read Spring Config Java Class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Get Bean from Spring Container
        //Coach theCoach = context.getBean("swimCoach", Coach.class);    // default Coach Without properties file
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);    // swim Coach With properties file

        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // Use property file methods
        System.out.println("Name of Coach: "+theCoach.getName());
        System.out.println("Email of Coach: "+theCoach.getEmail());

        // Close the context
        context.close();
    }
}
