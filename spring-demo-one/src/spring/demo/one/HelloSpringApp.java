/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Rifas
 */
public class HelloSpringApp {
    public static void main(String[] args){
        // load the spring config files
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/demo/one/applicationContext.xml");
        
        // load the bean from the spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        
        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        
        // close the context
        context.close();
    }
}
