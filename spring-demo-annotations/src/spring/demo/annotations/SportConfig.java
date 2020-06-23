package spring.demo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("spring.demo.annotations")
@PropertySource("classpath:sport.properties")   // Use properties file
public class SportConfig {

    // Define bean for sad fortune Service
    @Bean
    public FortuneService sadFortuneService(){ // method name is the bean ID
        return new SadFortuneService();
    }

    // Define bean for swim coach and inject dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService()); // Dependency injection of sad fortune service in swimCOach
    }
}
