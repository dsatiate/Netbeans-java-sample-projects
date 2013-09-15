/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5;

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
        new NewThread("One");
	new NewThread("Two");
	new NewThread("Three");
        try{
		Thread.sleep(5000);
	}
        catch(InterruptedException e){}
	System.out.println("Main exiting");
	}
    }

