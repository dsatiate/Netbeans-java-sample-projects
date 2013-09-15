/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9;

/**
 *
 * @author admin
 */
public class obj {
    Boolean valueset=true;
    int state=1;
   synchronized  public void display(int[] a){
        while(!valueset){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("InterruptedException Caught.");
            }
        }
        valueset=false;
        System.out.println();
        System.out.print("[");
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println("]");
        valueset=true;
        state++;
        notify();
    }
    
}
