/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;

/**
 *
 * @author admin
 */
public class DrinkCoffee {
    public DrinkCoffee(coffee c){
        try{
            c.checkTemp();
        }catch(TooColdException e){
            System.out.println("TooCold.");
        }catch(TooHotException e){
            System.out.println("TooHot.");
        }
        catch(Exception e){
            System.out.println("Coffee is Fine.");
        }
        
            
    }
    
}
