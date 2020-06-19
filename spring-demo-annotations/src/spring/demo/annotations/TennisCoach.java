package spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component("theTennisCoach")    // beanID which spring calls (explicit)
@Component          // default BeanID - tennisCoach
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    /*
    // Constructor injection
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
     */

    public TennisCoach(){
        System.out.println("Inside Tennis Coach Default Constructor.");
    }

    // Setter Injection
    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println("Inside Setter injection setFortuneService()");
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practise more!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
