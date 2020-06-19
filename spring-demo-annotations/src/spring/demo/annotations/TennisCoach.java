package spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component("theTennisCoach")    // beanID which spring calls (explicit)
@Component          // default BeanID - tennisCoach
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
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
