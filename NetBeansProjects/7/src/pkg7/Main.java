/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
       
        myThread tr=new myThread("mythread");
        while(!tr.valueset);
        for(int i=1;i<=10;i++){
            System.out.println(3*i);
        }
        
    }
}
