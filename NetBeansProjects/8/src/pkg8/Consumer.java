/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8;

/**
 *
 * @author admin
 */
public class Consumer implements Runnable{
    Q q;

    Consumer(Q q) {

        this.q = q;

        new Thread(this, "Consumer").start();

    }
    @Override

    public void run() {

        while(true) {

            q.get();

        }

    }
    
}
