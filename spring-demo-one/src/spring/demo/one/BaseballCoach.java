package spring.demo.one;
public class BaseballCoach implements Coach{
    
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practise.";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
