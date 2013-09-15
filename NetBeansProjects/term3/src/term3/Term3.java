/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package term3;

/**
 *
 * @author admin
 */
public class Term3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        account q = new account();
   Deposite  d= new Deposite(q);
   Withdraw  w=new Withdraw(q);
    //System.out.println("Press Control-C to stop.");
    }
}
