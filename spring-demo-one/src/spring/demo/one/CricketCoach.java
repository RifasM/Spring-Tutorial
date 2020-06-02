package spring.demo.one;

public class CricketCoach implements Coach{
    // private setter fields
    private FortuneService fortuneService;
    private String name;
    private String team;

    // No argument Constructor

    public CricketCoach() {
        System.out.println("Inside No argument constructor of Cricket Coach");
    }

    // Setter method to be called by Spring
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside Fortune Setter method of Cricket Coach");
        this.fortuneService = fortuneService;
    }

    public String getName() {
        System.out.println("Inside Name Getter method of Cricket Coach");
        return name;
    }

    public void setName(String name) {
        System.out.println("Inside Name Setter method of Cricket Coach");
        this.name = name;
    }

    public String getTeam() {
        System.out.println("Inside Team Getter method of Cricket Coach");
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Inside Team Setter method of Cricket Coach");
        this.team = team;
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
