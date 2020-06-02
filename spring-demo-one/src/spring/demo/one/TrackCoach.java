package spring.demo.one;

public class TrackCoach implements Coach {

    // Define a private field for the dependency
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
        // dummy implementation
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Go Ahead "+fortuneService.getFortune();
    }

    // add an init method
    public void myInit(){
        System.out.println("My Init method");
    }

    // add destroy method
    public void myDestroy(){
        System.out.println("My Destroy method");
    }
}
