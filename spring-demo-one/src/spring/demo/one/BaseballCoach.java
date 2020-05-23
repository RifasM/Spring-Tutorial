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
public class BaseballCoach implements Coach{
    
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practise.";
    }
}
