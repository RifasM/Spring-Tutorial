package spring.demo.one;
public class BaseballCoach implements Coach{

    // Define a private field for the dependency
    private FortuneService fortuneService;

    // Define a Constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practise.";
    }

    @Override
    public String getDailyFortune() {
        // Use myFortuneService to get a fortunw
        return fortuneService.getFortune();
    }
}
