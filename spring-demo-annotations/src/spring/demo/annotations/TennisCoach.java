package spring.demo.annotations;

import org.springframework.stereotype.Component;

// @Component("theTennisCoach")    // beanID which spring calls (explicit)
@Component          // default BeanID - tennisCoach
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practise more!";
    }
}
