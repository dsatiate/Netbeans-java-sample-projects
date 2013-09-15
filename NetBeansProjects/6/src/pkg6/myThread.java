/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6;

/**
 *
 * @author admin
 */
public class myThread implements Runnable {
    number num;
    String name;
    
    public myThread(number q,String name) {
        this.num = q;
        this.name=name;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        
       while(true){
           //System.out.print(name+":");
           num.increment();
       }
    }
    
}
