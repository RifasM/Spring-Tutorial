package spring.demo.annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
    // Create an array of strings
    private String[] data = {"A Part of the journey is the end",
                             "Beware of the wolf in sheep's clothing",
                             "The journey is the reward",
                             "Diligence is the mother of good luck"};

    // Random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        // pick a random fortune from array
        return data[myRandom.nextInt(data.length)];
    }
}
