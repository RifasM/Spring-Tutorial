package spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

// @Component("theTennisCoach")    // beanID which spring calls (explicit)
@Component          // default BeanID - tennisCoach
public class TennisCoach implements Coach{

    /*
    // Use without @Autowire
    private FortuneService fortuneService;
    */

    /*
    // Field Injection
    @Autowired
    private FortuneService fortuneService;
    */

    /*
    // Constructor injection
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
     */

    // Multiple Dependency Injection
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println("Inside Tennis Coach Default Constructor.");
    }

    /*
    // Setter Injection
    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println("Inside Setter injection setFortuneService()");
        this.fortuneService = theFortuneService;
    }
     */

    /*
    // Method Injection
    @Autowired
    public void methodInjection(FortuneService theFortuneService){
        System.out.println("Inside methodInjection");
        this.fortuneService = theFortuneService;
    }
     */

    @Override
    public String getDailyWorkout() {
        return "Practise more!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
