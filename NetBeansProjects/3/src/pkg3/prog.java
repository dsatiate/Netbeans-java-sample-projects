/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

/**
 *
 * @author admin
 */
public class prog {
    int count=0;
    public void loop(){
        int result = 0;
        int divisor = 0; 
        for(int i=0;i<1000;i++){
            try {
                divisor = (int)(100*Math.random());
                result = 1000/divisor;                                         
            } 
            catch(ArithmeticException e) {
                count++;
            }
        }
    }
    
}
