/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5;

/**
 *
 * @author admin
 */

public class NewThread extends Thread {
	String name;
	//Thread t;
	NewThread(String tname){
            super(tname);	
            name=tname;
		//t=new Thread(this,name);
		
                System.out.println("New Thread : "+this);
		this.start();
	}
    @Override
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println(name+" : "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Exception");
		}
		System.out.println(name+" exiting");
	}

    
}
