/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        MyThread hi = new MyThread("HighP",Thread.NORM_PRIORITY + 4);
        MyThread lo = new MyThread("LowP",Thread.NORM_PRIORITY - 4);
        lo.start();
        hi.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        System.out.println("Main thread interrupted.");
        }
        lo.stop();
        hi.stop();
        // Wait for child threads to terminate.
        try {
            hi.t.join();
            lo.t.join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        System.out.println("Low-priority thread: " + lo.count);
        System.out.println("High-priority thread: " + hi.count);
    }
}
