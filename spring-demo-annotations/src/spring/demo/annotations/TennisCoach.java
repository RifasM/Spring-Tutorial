package spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component("theTennisCoach")    // beanID which spring calls
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practise more!";
    }
}
