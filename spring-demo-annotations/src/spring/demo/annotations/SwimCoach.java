package spring.demo.annotations;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

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
}
