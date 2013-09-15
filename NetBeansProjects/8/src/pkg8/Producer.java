/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8;

/**
 *
 * @author admin
 */
public class Producer implements Runnable{
    Q q;
    Producer(Q q) {

        this.q = q;

        new Thread(this, "Producer").start();

    }

    @Override
    public void run() {

        int i = 0;

        while(true) {

            q.put(i++);

        }

    }

}

