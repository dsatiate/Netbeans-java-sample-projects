/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6;

/**
 *
 * @author admin
 */
public class number {
    int n=1;
    boolean valueSet = true;

    synchronized void increment() {

        while(!valueSet)
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println("InterruptedException Caught.");
            }
        
            valueSet=false;
            if(n<=200){
                System.out.println(n);
                n++;
            }
            valueSet = true;
            notify();
        
    }
    
}
