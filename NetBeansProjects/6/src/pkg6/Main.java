/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6;

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
        number N=new number();
        new myThread(N, "one");
        new myThread(N, "two");
    }
}
