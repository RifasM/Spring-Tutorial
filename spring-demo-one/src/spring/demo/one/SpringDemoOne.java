/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.demo.one;

/**
 *
 * @author Rifas
 */
public class SpringDemoOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the object
        BaseballCoach theCoach = new BaseballCoach();
        
        // Use the object
        System.out.println(theCoach.getDailyWorkout());
    }
    
}
