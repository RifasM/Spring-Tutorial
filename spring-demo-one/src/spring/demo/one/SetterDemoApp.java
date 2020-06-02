package spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args){
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./spring/demo/one/applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods to the bean
        System.out.println("Your Daily Workout:\n\t"+theCoach.getDailyWorkout());

        System.out.println("Fortune for today:\n\t"+theCoach.getDailyFortune());

        System.out.println("Name: "+theCoach.getName());

        System.out.println("Team: "+theCoach.getTeam());

        // close the context
        context.close();
    }
}
