/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9;

/**
 *
 * @author admin
 */
public class newthread implements Runnable{
    int[] a;
    obj q;
    int priority;
    Thread t;
    String name;
    
    public newthread(obj q,int[] a,int p){
        this.q=q;
        this.a=a;
        priority=p;
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while(q.state!=priority);
        q.display(a);
    }
    
}
