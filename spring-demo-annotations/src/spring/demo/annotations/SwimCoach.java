package spring.demo.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    // Use Properties file
    @Value("${foo.name}")
    private String name;

    @Value("${foo.email}")
    private String email;

    public SwimCoach(FortuneService thefortuneService) {
        this.fortuneService = thefortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100m as a warm up!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
