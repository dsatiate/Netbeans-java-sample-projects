/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19;

/**
 *
 * @author admin
 */
public class MyThread implements Runnable{
    Thread t;
    volatile boolean run=true;
    long count=0;
    public MyThread(String name,int newPriority){
        t=new Thread(this, name);
        t.setPriority(newPriority);
        
    }
    @Override
    public void run() {
        while(run){
            count++;
        }
    }
    public void stop() {
        run=false;
    }
    public void start(){
        t.start();
    }
}
