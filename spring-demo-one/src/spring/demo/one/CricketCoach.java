package spring.demo.one;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    // No argument Constructor

    public CricketCoach() {
        System.out.println("Inside No argument constructor of Cricket Coach");
    }

    // Setter method to be called by Spring
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside Setter method of Cricket Coach");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 30 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
