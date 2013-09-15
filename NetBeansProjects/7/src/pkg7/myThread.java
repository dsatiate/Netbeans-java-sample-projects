/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7;

/**
 *
 * @author admin
 */
    public class myThread implements Runnable {
    String name;
    Boolean valueset=false;
    
    public myThread(String name) {
        this.name=name;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(2*i);
        }
        valueset=true;
    }
    
}


